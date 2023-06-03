package com.devb.book_store.repository;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.devb.book_store.service.ObjectNotFoundException;

@RestControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<ResponseError> objectNotFoundException(ObjectNotFoundException ex){
		ResponseError responseError = new ResponseError(LocalDate.now(),HttpStatus.NOT_FOUND.value(),ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseError);
		
	}

}
