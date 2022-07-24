package com.example.wiprologreg.service;

import org.springframework.stereotype.Service;

import com.example.wiprologreg.exception.AdminAlreadyRegisterException;
import com.example.wiprologreg.model.Admin;
import com.example.wiprologreg.model.User;


public interface AdminService {

	public Admin saveAdmin(Admin admin) throws AdminAlreadyRegisterException;
	public Admin findByEmailAndSecurityQuestionAndSecurityAnswer(String email, String securityQuestion,String securityAnswer);
	public Admin findByEmailAndPassword(String email, String password);
	public Admin resetPassword(Admin admin);

	
	
}


