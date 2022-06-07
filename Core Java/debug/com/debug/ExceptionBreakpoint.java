package debug;

public class ExceptionBreakpoint
{
	
	  public static void main(String args[])
	  {  
	   try{  
	      //raise exception  
	      int data=100/0;  
	   }catch(ArithmeticException e){System.out.println(e);}
	   
	   System.out.println("rest of the code...");  
	  }  
	} 
