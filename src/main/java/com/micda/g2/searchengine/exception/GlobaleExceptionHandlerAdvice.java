package com.micda.g2.searchengine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobaleExceptionHandlerAdvice {

	  @ExceptionHandler({ResourceNotFoundException.class})
	  public final void handleException() {
		  
	  }
	  
	  @ResponseBody
	  @ExceptionHandler(ResourceNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String ResourceNotFoundHandler(ResourceNotFoundException ex) {
	    return ex.getMessage();
	  } 
	  
}
