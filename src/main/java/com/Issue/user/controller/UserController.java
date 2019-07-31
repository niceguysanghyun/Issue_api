package com.Issue.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Issue.base.entity.Result;
import com.Issue.user.data.SignInData;
import com.Issue.user.entity.User;
import com.Issue.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("signIn")
	public Result Signin(@RequestBody @Validated SignInData data) {
		 return new Result().success();
	}
	
	@GetMapping("test")
	public User test(@RequestParam String name) {
		System.out.println(name);
		 return this.userService.findOne(name);
	}
	
	@GetMapping("test2")
	public String test2(@RequestParam String name) {
		 return "hi";
	}
}
