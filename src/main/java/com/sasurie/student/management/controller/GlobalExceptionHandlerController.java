package com.sasurie.student.management.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sasurie.student.management.utility.AppException;
import com.sasurie.student.management.utility.ErrorCode;

@ControllerAdvice
public class GlobalExceptionHandlerController {
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandlerController.class);
	@ExceptionHandler(AppException.class)
	public ResponseEntity<List<ErrorCode>> handleException(AppException e) {
		for(ErrorCode error : e.getErrorCode()) {
			logger.error("Code: " +error.getCode()+ " Message: " +error.getErrorMeggage() + " Cause: " + e.getCause());
		}
		return new ResponseEntity<List<ErrorCode>>(e.getErrorCode(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAllException(Exception e) {
		logger.error("Server Error Messsage" +e.getMessage() + " Cause: " + e.getCause());
		return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
