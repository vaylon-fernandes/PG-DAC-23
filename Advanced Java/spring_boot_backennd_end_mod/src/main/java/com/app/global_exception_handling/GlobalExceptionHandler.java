package com.app.global_exception_handling;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
		Map<String, String> map = new HashMap<>();
		for(FieldError f:e.getFieldErrors()) {
			map.put(f.getField(), f.getDefaultMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(map);
	}
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> Exception(RuntimeException e){
		
		return ResponseEntity.status(HttpStatus.OK).body(e.getMessage());
	}
}
