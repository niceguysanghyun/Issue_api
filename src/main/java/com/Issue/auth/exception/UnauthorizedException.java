package com.Issue.auth.exception;

public class UnauthorizedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnauthorizedException() {
		super("계정권한이 유효하지 않습니다. 다시로그인해주세요");
	}
}
