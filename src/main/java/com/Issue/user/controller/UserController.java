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
import com.Issue.user.data.SignUpData;
import com.Issue.user.entity.User;
import com.Issue.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("signUp")
	public Result SignUp(@RequestBody @Validated SignUpData data) {
		 return userService.SignUp(data);
	}
	
	@PostMapping("signIn")
	//@RequestBody Map<String, Object> input
	public Result SignIn(@RequestBody @Validated SignInData input) {
		String accessToken = userService.SignIn(input);
		
		Result rslt = new Result();
		if(accessToken == null) {
			rslt.fali(101,"일치하지 않는  패스워드");
		}
		else {
			rslt.success(accessToken);
		}
		return rslt;
	}
	
	@GetMapping("test2")
	public String test2(@RequestParam String name) {
		 return "hi";
	}
}
