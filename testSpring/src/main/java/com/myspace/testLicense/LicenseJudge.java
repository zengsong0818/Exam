package com.myspace.testLicense;

import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import com.myspace.licenseprj.Applicant;//导入数据

//workBench提供数据对象和DRL
public class LicenseJudge {
	public static void main(String[] args) {
		try {
			KieServices ks = KieServices.Factory.get();
			//调用jar包
			ReleaseId releaseId = ks.newReleaseId("com.myspace", "LicensePrj", "1.0.0-SNAPSHOT");
			KieContainer kContainer = ks.newKieContainer(releaseId);
			//KieScanner kScanner = ks.newKieScanner(kContainer);
			//kScanner.start(10000l);  //定时扫描
			KieSession kSession = kContainer.newKieSession();
			Applicant driver = new Applicant();
			driver.setName("zengsong");
			driver.setAge(90);
			kSession.insert(driver);
			kSession.fireAllRules();
			if (driver.isIsValid()==true) {
				System.out.println("Can Drive");
			} else {
				System.out.println("Can't Drive");
			}
			
		} catch (Throwable t) {
			t.printStackTrace();
		}

	}
}
