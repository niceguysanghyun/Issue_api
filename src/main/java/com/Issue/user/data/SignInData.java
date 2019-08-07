package com.Issue.user.data;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 
 * @author LEE
 * 다음부턴 하나의 엔티티에다 처리하자..
 */

@Data
@Accessors(chain = true) //Method Chaining
public class SignInData {
	@NotBlank
	private String id;
	@NotBlank
	private String password;
}
