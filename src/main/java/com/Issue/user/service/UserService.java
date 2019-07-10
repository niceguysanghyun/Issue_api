package com.Issue.user.service;

import com.Issue.base.entity.Result;
import com.Issue.user.data.SignInData;
import com.Issue.user.data.SignUpData;

public interface UserService {
	Result SignIn(SignInData data);
	Result SignUp(SignUpData data);
}
