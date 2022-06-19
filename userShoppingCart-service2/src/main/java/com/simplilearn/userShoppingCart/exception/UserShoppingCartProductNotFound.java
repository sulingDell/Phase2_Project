package com.simplilearn.userShoppingCart.exception;

public class UserShoppingCartProductNotFound  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UserShoppingCartProductNotFound(String message) {
		super(message);
	}

}
