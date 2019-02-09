package com.cg.library.exceptions;

public class MemberNotFoundException extends Exception {

	public MemberNotFoundException() {
		super();
	}

	public MemberNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		}

	public MemberNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public MemberNotFoundException(String message) {
		super(message);
		}

	public MemberNotFoundException(Throwable cause) {
		super(cause);
	}

	
}
