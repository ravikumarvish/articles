/**
 * 
 */
package com.test.sample.exception;

/**
 * @author ravi_exception
 *
 */
public class EmployeeRunTimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeRunTimeException(String message){
		super(message);
	}
}
