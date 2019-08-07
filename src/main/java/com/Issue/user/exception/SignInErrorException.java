package com.Issue.user.exception;

import com.Issue.base.exception.ServiceException;

public class SignInErrorException extends ServiceException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SignInErrorException() {
		super(10000,"아이디 혹은 패스워드가 맞지 않습니다.");
	}
	
}
