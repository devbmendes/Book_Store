package com.devb.book_store.controller.exceptionHandler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.devb.book_store.service.exception.DataIntegratyViolationException;
import com.devb.book_store.service.exception.ObjectNotFoundException;

@RestControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<ResponseError> objectNotFoundException(ObjectNotFoundException ex){
		ResponseError responseError = new ResponseError(LocalDate.now(),HttpStatus.NOT_FOUND.value(),ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseError);
		
	}
	
	@ExceptionHandler(DataIntegratyViolationException.class)
	public ResponseEntity<ResponseError> objectNotFoundException(DataIntegratyViolationException ex){
		ResponseError responseError = new ResponseError(LocalDate.now(),HttpStatus.BAD_REQUEST.value(),ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseError);
		
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseError> objectNotFoundException(MethodArgumentNotValidException ex){
		ValidationError validationError = new ValidationError(LocalDate.now(),HttpStatus.BAD_REQUEST.value(),
				"Validations Field Errors");
		List<FieldError> list = new ArrayList<>();
		BindingResult bindingResult = ex.getBindingResult();
		for(org.springframework.validation.FieldError fieldError: bindingResult.getFieldErrors()) {
			FieldError fError = new FieldError();
			fError.setFieldname(fieldError.getField());
			fError.setMessage(fieldError.getDefaultMessage());
			list.add(fError);
		}
		
//		ex.getBindingResult().getAllErrors().forEach((error)->{
//			fieldError .setFieldname((org.springframework.validation.FieldError)error).getField().toString());
//			fieldError.setMessage(error.getDefaultMessage());
//			list.add(fieldError);
//		});
		
		validationError.setErrors(list);
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validationError);
		
	}

}
