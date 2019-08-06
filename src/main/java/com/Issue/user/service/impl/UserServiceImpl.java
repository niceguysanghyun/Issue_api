package com.Issue.user.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Issue.auth.service.JwtService;
import com.Issue.base.entity.Result;
import com.Issue.user.data.SignInData;
import com.Issue.user.data.SignUpData;
import com.Issue.user.entity.User;
import com.Issue.user.exception.SignInErrorException;
import com.Issue.user.repository.UserRepository;
import com.Issue.user.service.UserService;

@Service("userService")
@Transactional
public class UserServiceimpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JwtService jwtservice;
	
	public User findOne(String name) {
		return this.userRepository.findByName(name);
	}
	
	@Override
	public User findById(String id) {
		return this.userRepository.findById(id);
	}
	
	@Override
	public String  SignIn(SignInData data) {
		User user = this.userRepository.findByIdAndPassword(data.getId(), data.getPassword());
		
		if(user !=null) {
			return jwtservice.create(user,"ISSUE");
		} else {
		throw new SignInErrorException();
		}
		
	}

	@Override
	public Result SignUp(SignUpData data) {
		return null;
	}
	
}
