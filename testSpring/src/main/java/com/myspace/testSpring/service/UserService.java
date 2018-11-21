package com.myspace.testSpring.service;


import java.util.List;

import com.myspace.testSpring.bean.User;

public interface UserService {
	List<User> getAllUser();
	User getUser(String name);
	User selectByPrimaryKey(String string);
	Long updatePoint(String name, Long point);
	
}
