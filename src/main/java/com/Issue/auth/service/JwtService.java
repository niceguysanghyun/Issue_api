package com.Issue.auth.service;

import com.Issue.user.entity.User;

public interface JwtService {
	public <T> String create(User user, String subject);
	public byte[] generateKey();
	public boolean isUsable(String jwt);
}
