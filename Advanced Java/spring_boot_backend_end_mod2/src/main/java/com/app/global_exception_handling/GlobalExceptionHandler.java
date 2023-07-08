package com.app.global_exception_handling;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
		Map<String, String> map = new HashMap<>();
		for(FieldError f:e.getFieldErrors()) {
			map.put(f.getField(), f.getDefaultMessage());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
	}
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage()));
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException e){
		Map<String, String> map = new HashMap<>();
		for(ConstraintViolation<?> f:e.getConstraintViolations()) {
			map.put(f.getPropertyPath().toString(), f.getMessage());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> Exception(RuntimeException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}
}
