package com.test.sample.bean;

/**
 * @author ravi_exception
 *
 */
public class ErrorInfo {

	private String message;
	private String url;

	public ErrorInfo(String message, String url) {
		this.message = message;
		this.url = url;
	}

	public String getMessage() {
		return message;
	}

	public String getUrl() {
		return url;
	}

}
