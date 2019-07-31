package com.Issue.auth.exception;

public class UnauthorizedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnauthorizedException() {
		super("UnauthorizedException");
	}
}
