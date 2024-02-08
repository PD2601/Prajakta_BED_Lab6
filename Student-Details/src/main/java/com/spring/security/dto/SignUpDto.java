package com.spring.security.dto;

import lombok.Data;

@Data
public class SignUpDto {
	private String name;
	private String username;
	private String email;
	private String password;
}
