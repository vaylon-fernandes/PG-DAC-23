package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRespDTO {
	private String empName; 
	private String address;
	private LocalDate joinDate;
	private int age;
	private String department;

}
