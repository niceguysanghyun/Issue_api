package com.Issue.user.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Issue.user.data.SignInData;
import com.Issue.user.data.SignUpData;
import com.Issue.user.entity.User;
import com.Issue.user.repository.UserRepository;

public interface UserService {


	public User findOne(String name); 
	public User findById(String id); 
	public String SignIn(SignInData data);
	public String SignUp(SignUpData data);
}
