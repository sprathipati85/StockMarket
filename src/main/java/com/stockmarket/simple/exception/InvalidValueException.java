package com.stockmarket.simple.exception;

public class InvalidValueException extends  RuntimeException{

	private static final long serialVersionUID = 8930262426061874781L;
	
	public InvalidValueException(String message){
		super(message);
	}
}
