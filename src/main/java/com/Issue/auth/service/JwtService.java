package com.Issue.auth.service;

public interface JwtService {
	public <T> String create(String Key, T data, String subject);
	public byte[] generateKey();
	public boolean isUsable(String jwt);
}
