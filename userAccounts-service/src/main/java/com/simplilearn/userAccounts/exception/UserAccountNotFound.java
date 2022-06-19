package com.simplilearn.userAccounts.exception;

public class UserAccountNotFound  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UserAccountNotFound(String message) {
		super(message);
	}

}