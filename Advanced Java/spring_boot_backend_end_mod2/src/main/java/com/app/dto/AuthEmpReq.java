package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString
public class AuthEmpReq {
	@NotBlank(message="Email can't be blank")
	@Email
	private String emailId; 
	@NotBlank(message="Password can't be blank")
	private String password;
}
