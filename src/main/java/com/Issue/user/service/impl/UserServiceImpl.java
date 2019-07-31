package com.Issue.user.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Issue.user.entity.User;
import com.Issue.user.repository.UserRepository;
import com.Issue.user.service.UserService;

@Service("userService")
@Transactional
public class UserServiceimpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	public User findOne(String name) {
		System.out.println("name"+name);
		return this.userRepository.findByName(name);
	}
	
	
	
}
