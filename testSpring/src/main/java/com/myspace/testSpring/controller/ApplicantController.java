package com.myspace.testSpring.controller;

import java.util.List;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspace.testSpring.bean.Applicant;
import com.myspace.testSpring.service.ApplicantService;

import org.springframework.ui.Model;

/*
 * 控制层
 */
@RequestMapping("/test")
@Controller
public class ApplicantController {
	@Autowired
	//访问applicant数据库表（数据）
	private ApplicantService applicantService;
   
	//使用thymeleaf设计前台页面
	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}

	@RequestMapping("/inputName")
	public String inputName() {
		return "inputName";
	}
	
	@RequestMapping("/applicant")
	public String getApplicant(Model model) {
		List<Applicant> applicants = applicantService.getAllApplicant();
		model.addAttribute("applicant", applicants);
		return "applicant";
	}

	@RequestMapping(value = "/license", method = RequestMethod.POST)
	public String getLicense(@RequestParam(value="name", required=false) String name,Model model) {
		String res = null;
		try {
			// 调用applicant-Jar包（数据和规则）
//			KieServices ks = KieServices.Factory.get();
//			ReleaseId releaseId = ks.newReleaseId("com.myspace", "licenseprj", "1.0.0-SNAPSHOT"); // 规则
//			KieContainer kContainer = ks.newKieContainer(releaseId);
//			KieSession kSession = kContainer.newKieSession();

			// 加载本地drl文件
//			KieServices ks = KieServices.Factory.get();
//			KieContainer kContainer = ks.getKieClasspathContainer();
//			KieSession kSession = kContainer.newKieSession("license-rules");
			
			// 加载本地Excel表
			KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("license-dtables");

			Applicant driver = applicantService.getApplicant(name); // mysql的数据
			
//			com.myspace.licenseprj.Applicant temp = new com.myspace.licenseprj.Applicant();//包里的数据
//			//给包里的数据赋值
//			temp.setAge(driver.getAge());
//			temp.setName(driver.getName());
			
			kSession.insert(driver);
			kSession.fireAllRules();// 执行规则
		
//			driver.setValid(temp.isIsValid());//计算完毕后返回值给mysql实例
			if (driver!=null&&driver.isValid()==true) {
				res = driver.getName() + " is " + driver.getAge() + " years old. Can Drive";
				applicantService.updateValid(name, driver.isValid());// 保存到数据库
			}
			else if (driver!=null&&driver.isValid()==false) {
				res = driver.getName() + " is " + driver.getAge() + " years old. Can't Drive";
				applicantService.updateValid(name, driver.isValid());// 保存到数据库
			} else if(driver==null){
				res = name + " 不存在!";
			}
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
		model.addAttribute("result", res); //给前端传值
		
		return "license";
	}

}
