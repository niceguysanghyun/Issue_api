package com.Issue.board.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Issue.auth.service.JwtService;

@RestController
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private JwtService jwtService;
	
	@PostMapping("test")
	public String test(@RequestParam String test) {
		 
		
		return "test";
	}
}
