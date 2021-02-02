package com.mythri.exception;

public class UserException extends Exception {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3830848489867559241L;
	private final String errorCode;

	public UserException(String errorCode,String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
	
}

