package com.project.minerals.ExceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.project.minerals.Exceptions.ValidatingDuplicateValues;

@RestControllerAdvice
public class ExceptionHandlerEngine {
     
	 @ExceptionHandler(ValidatingDuplicateValues.class)
	 @ResponseStatus(value = HttpStatus.NOT_FOUND)
	 public ErroModelResponse NotValueData(ValidatingDuplicateValues ex , WebRequest request) {
		 ErroModelResponse erroReturn = new ErroModelResponse(
				 HttpStatus.NOT_FOUND.value(),
				 new Date(),
				 ex.getMessage(),
				 request.getDescription(false));
		 return erroReturn;
	 }
	 
	 @ExceptionHandler(Exception.class)
	 @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 public ErroModelResponse ErroModelResponse(Exception ex, WebRequest request) {
		 ErroModelResponse erroResponse = new ErroModelResponse(
				 HttpStatus.INTERNAL_SERVER_ERROR.value(),
				 new Date(),
				 ex.getMessage(),
				 request.getDescription(false));
		 return erroResponse;
	 }
}
