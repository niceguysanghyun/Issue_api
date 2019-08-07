package com.Issue.board.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Issue.auth.service.JwtService;
import com.Issue.user.entity.User;

@RestController
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	User user;
	
	@PostMapping("test")
	public String test(@RequestParam String test) {
		System.out.println();
		
		return "test";
	}
}
