package com.myspace.testSpring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspace.testSpring.bean.Applicant;
import com.myspace.testSpring.mapper.ApplicantMapper;
import com.myspace.testSpring.service.ApplicantService;
/*
 * 事务逻辑实现类
 */
@Service("applicantService")
public class ApplicantServiceImpl implements ApplicantService {
	@Autowired
	private ApplicantMapper applicantMapper;
 
	@Override
	public List<Applicant> getAllApplicant() {
		return applicantMapper.getAllApplicant();
	}
	@Override
	public Applicant getApplicant(String name) {
		return applicantMapper.getApplicant(name);
	}
	@Override
	public Boolean updateValid(String name,boolean valid) {
		return applicantMapper.updateValid(name,valid);
	}
}
