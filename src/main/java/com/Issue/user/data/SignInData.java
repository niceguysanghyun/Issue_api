package com.Issue.user.data;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true) //Method Chaining
public class SignInData {
	@NotBlank
	private String id;
	@NotBlank
	private String password;
}
