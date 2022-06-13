package MethodsToPrintException;

// 3) getMessage()

public class GetMessage {
	
	public static void main(String[] args) {
		
		try 
			{ 
		        System.out.println("Inside the try block");    
		        int data=25/0;    
		    }     
		      catch(ArithmeticException e){  
		    	System.out.println(e.getMessage());  
		      }  
		}
	}
