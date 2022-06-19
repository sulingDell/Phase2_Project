package com.simplilearn.userAccounts.exception;

public class UserAccountAlreadyExist  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UserAccountAlreadyExist(String message) {
		super(message);
	}

}
