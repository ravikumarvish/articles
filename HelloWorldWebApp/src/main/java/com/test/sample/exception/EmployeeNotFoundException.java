/**
 * 
 */
package com.test.sample.exception;

/**
 * @author ravi_exception
 *
 */
public class EmployeeNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
