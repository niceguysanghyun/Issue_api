package com.Issue.user.exception;

import com.Issue.base.exception.ServiceException;

public class SignUpErrorException extends ServiceException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SignUpErrorException() {
		super(11000,"이미 존재하는 아이디입니다.");
	}

}
