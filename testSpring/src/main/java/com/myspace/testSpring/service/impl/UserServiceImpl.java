package com.myspace.testSpring.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myspace.testSpring.bean.User;
import com.myspace.testSpring.mapper.UserMapper;
import com.myspace.testSpring.service.UserService;

@Service("userService")

public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mUserMapper;
	@Override
	public User getUser(String name) {
		return mUserMapper.getUser(name);
	}

	@Override
	public User selectByPrimaryKey(String name) {
		// TODO Auto-generated method stub
		return mUserMapper.selectByPrimaryKey(name);
	}

	@Override
	public Long updatePoint(String name, Long point) {
		// TODO Auto-generated method stub
		return mUserMapper.updatePoint(name, point);  
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return mUserMapper.getAllUser();
	}
}

