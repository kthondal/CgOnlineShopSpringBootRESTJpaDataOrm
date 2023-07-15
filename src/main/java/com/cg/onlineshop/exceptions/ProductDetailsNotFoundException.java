package com.cg.onlineshop.exceptions;

public class ProductDetailsNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3437272194969154975L;

	public ProductDetailsNotFoundException() {
		super();
	}

	public ProductDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProductDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductDetailsNotFoundException(String message) {
		super(message);
	}

	public ProductDetailsNotFoundException(Throwable cause) {
		super(cause);
		
	}

}
