package com.cognizant.truyum.dao;

/**
 * 
 * @author ManiKandan V
 *
 */
public class CartEmptyException extends Exception {
	private String message;

	public CartEmptyException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
