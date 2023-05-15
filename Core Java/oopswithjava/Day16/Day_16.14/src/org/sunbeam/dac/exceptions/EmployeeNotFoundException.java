package org.sunbeam.dac.exceptions;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception{
	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
