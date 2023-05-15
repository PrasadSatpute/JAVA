package org.sunbeam.dac.exceptions;

@SuppressWarnings("serial")
public class StackUnderflowException extends Exception{
	public StackUnderflowException(String message) {
		super(message);
	}
}
