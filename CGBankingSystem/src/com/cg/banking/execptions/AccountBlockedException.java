package com.cg.banking.execptions;

public class AccountBlockedException extends Exception {
 public AccountBlockedException() {
	
}

public AccountBlockedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	// TODO Auto-generated constructor stub
}

public AccountBlockedException(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
}

public AccountBlockedException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
}

public AccountBlockedException(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
}
}
