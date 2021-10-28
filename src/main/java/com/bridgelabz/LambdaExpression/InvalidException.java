package com.bridgelabz.LambdaExpression;

public class InvalidException extends Exception{
	ExceptionType type;

	public InvalidException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

	enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY, ENTERED_WRONG;
	}
}
