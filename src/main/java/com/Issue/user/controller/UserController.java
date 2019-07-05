package com.Issue.user.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Issue.base.entity.Result;
import com.Issue.user.data.SignInData;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping("signIn")
	public Result Signin(@RequestBody @Validated SignInData data) {
		 return new Result().success();
	}
	
}
