package com.myspace.testSpring.service;

import java.util.List;

import com.myspace.testSpring.bean.Applicant;
/*
 * 事务逻辑接口
 */
public interface ApplicantService {
	List <Applicant> getAllApplicant();
	Applicant getApplicant(String name);
	Boolean updateValid(String name,boolean valid);
}
