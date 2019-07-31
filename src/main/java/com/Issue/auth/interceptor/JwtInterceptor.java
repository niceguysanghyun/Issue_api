package com.Issue.auth.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.Issue.auth.service.JwtService;


@Component
public class JwtInterceptor implements HandlerInterceptor {
	
	private static final String HEADER_AUTH ="Authorization";
	@Autowired
	private JwtService jwtService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		final String token= request.getHeader(HEADER_AUTH);
		if(token !=null && jwtService.isUsable(token)) {
			return true;
		}else {
			
		}
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
}
