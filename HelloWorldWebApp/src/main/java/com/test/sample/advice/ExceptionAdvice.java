package com.test.sample.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.test.sample.bean.ErrorInfo;
import com.test.sample.exception.EmployeeBadRequestException;
import com.test.sample.exception.EmployeeNotFoundException;
import com.test.sample.exception.EmployeeRunTimeException;

/**
 * 
 * @author ravi_exception
 *
 */

@ControllerAdvice
public class ExceptionAdvice {
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseBody
	public ErrorInfo handleNotFoundException(HttpServletRequest req,EmployeeNotFoundException exception) {
		return new ErrorInfo(exception.getMessage(),req.getRequestURL().toString());
	}
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(EmployeeBadRequestException.class)
	@ResponseBody
	public ErrorInfo handleBadRequestException(HttpServletRequest req,EmployeeBadRequestException exception) {
		return new ErrorInfo(exception.getMessage(),req.getRequestURL().toString());
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(EmployeeRunTimeException.class)
	@ResponseBody
	public ErrorInfo handleRuntimeException(HttpServletRequest req,EmployeeRunTimeException exception) {
		return new ErrorInfo(exception.getMessage(),req.getRequestURL().toString());
	}
	

}
