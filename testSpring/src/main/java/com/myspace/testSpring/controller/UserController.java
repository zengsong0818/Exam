package com.myspace.testSpring.controller;

import java.util.List;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.myspace.testSpring.bean.User;
import com.myspace.testSpring.service.UserService;

/*
 * 控制层
 */
@RequestMapping("/test")
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user")
	public String getUser(Model model) {
		List<User> user = userService.getAllUser();
		model.addAttribute("user", user);
		return "user";
	}
	@RequestMapping("/inputStoreName")
	public String inputStoreName() {
		return "inputStoreName";
	}
	
	@RequestMapping(value = "/store", method = RequestMethod.POST)
	// 调用WB远程服务器上的store-Jar包（数据和规则）
	   public String getBonus(@RequestParam(value="name", required=false) String name,Model model) {
		String res = null;
		try {
			//从jar包加载规则
//			KieServices ks = KieServices.Factory.get();
//			ReleaseId releaseId = ks.newReleaseId("com.myspace", "store", "1.0.0-SNAPSHOT");
//			KieContainer kContainer = ks.newKieContainer(releaseId);
//			KieSession kSession = kContainer.newKieSession();
			
			// 加载本地Excel表
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("license-dtables2");
			//前台传入name参数
			User mUser = userService.selectByPrimaryKey(name); //从数据库获取用户数据
			
			//com.myspace.store.User temp = new com.myspace.store.User(); //获取pojo实例
			//给pojo赋数据库实例的值
//			temp.setUsername(name);
//			temp.setBackNums(mUser.getBacknums());
//			temp.setBackAmount(mUser.getBackamount());
//			temp.setBirthday(mUser.getBirthday());
//			temp.setBuyAmount(mUser.getBuyamount());
//			temp.setBuyNums(mUser.getBuynums());
//			temp.setCreditNums(mUser.getCreditnums()); 
//			
			kSession.insert(mUser);
			kSession.fireAllRules(); //目前规则改的是pojo的数据而不是数据库的数据
			
			//mUser.setPoint(temp.getPoint()) ;//给数据库赋pojo的值
			if (mUser!=null) {
				res =name + " 最后的积分是： "+ mUser.getPoint().toString();
				userService.updatePoint(name,mUser.getPoint());
			}else
			{
				res= name + " 不存在!";
			}
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
		model.addAttribute("bonus", res);
		return "store";
	}
}
