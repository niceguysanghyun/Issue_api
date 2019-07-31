package com.Issue.user.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Issue.user.entity.User;
import com.Issue.user.repository.UserRepository;

public interface UserService {


	public User findOne(String name); 
	
	
	
}
