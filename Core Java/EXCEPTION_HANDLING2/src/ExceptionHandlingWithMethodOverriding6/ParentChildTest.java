package ExceptionHandlingWithMethodOverriding6;

public class ParentChildTest {
	
	public static void main(String args[]){    
		   Parent p = new Child();    
		     
		   try {    
		   p.msg();    
		   }  
		   catch(Exception e) {}  
		       
		  }        

}
