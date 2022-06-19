package com.simplilearn.userShoppingCart.exception;

public class UserShoppingCartAlreadyExist  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UserShoppingCartAlreadyExist(String message) {
		super(message);
	}

}
