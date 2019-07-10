package com.Issue.user.data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SignUpData {
	@NotBlank
	private String name;
	@NotBlank
	private String password;
	@Email
	private String email;
}
