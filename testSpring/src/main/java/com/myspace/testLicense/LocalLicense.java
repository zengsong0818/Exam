package com.myspace.testLicense;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.myspace.testSpring.bean.Applicant;
import com.myspace.testSpring.service.ApplicantService;


/**
 * Drools 最基本的用法.
 */
public class LocalLicense {
	
    	public static final void main(String[] args) {
       		try {
       		// 静态加载规则
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("license-rules");  //加载不同的drl文件   		
       		// 业务逻辑
			Applicant driver = new Applicant();
			driver.setName("zengsong");
			driver.setAge(10);
			kSession.insert(driver);
			kSession.fireAllRules();
			if (driver.isValid()==true) {
				System.out.println("Can Drive");
			} else {
				System.out.println("Can't Drive");
			}
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
