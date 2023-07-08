package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class ApiResponse {
	private String mesg;
	private LocalDate date; 
	
	public ApiResponse(String mesg) {
		this.mesg = mesg;
		this.date = LocalDate.now();
	}

}
