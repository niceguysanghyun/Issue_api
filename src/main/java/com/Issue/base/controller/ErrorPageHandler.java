package com.Issue.base.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Issue.base.entity.Result;

public class ErrorPageHandler implements ErrorController{
	
	@RequestMapping("/error")
	public Result handlerError() {
		return new Result().fali();
	}
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}

}
