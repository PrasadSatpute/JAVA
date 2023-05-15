package org.sunbeam.dac.test;
@SuppressWarnings("serial")
class StackUnderflowException extends Exception{	//Checked Exception
	public StackUnderflowException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class StackOverflowException extends RuntimeException{ //Unchecked Exception
	public StackOverflowException(String message) {
		super(message);
	}
}
public class Program {
	public static void main(String[] args){
		
	}
}
