package com.myspace.testSpring.mapper;

import java.util.List;

import com.myspace.testSpring.bean.Applicant;
/*
 * 持久层
 */
public interface ApplicantMapper {
	List <Applicant> getAllApplicant();
	Applicant getApplicant(String name);
	Boolean insertValid(boolean valid);
	Boolean updateValid(String name, boolean valid);
	
}
