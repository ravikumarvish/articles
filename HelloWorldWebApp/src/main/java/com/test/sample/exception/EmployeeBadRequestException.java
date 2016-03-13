/**
 * 
 */
package com.test.sample.exception;

/**
 * @author ravi_exception
 *
 */
public class EmployeeBadRequestException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public EmployeeBadRequestException(String message) {
		super(message);
	}

}
