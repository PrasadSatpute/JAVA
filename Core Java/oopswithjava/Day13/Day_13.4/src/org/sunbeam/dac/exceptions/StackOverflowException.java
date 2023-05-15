package org.sunbeam.dac.exceptions;

@SuppressWarnings("serial")
public class StackOverflowException extends Exception{
	public StackOverflowException(String message) {
		super(message);
	}
}
