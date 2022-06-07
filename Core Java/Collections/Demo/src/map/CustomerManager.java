package map;

import java.util.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class CustomerManager {
	
	   public static void main(String args[]){    

 
		       Map<Integer,String> listOfCustomers=new HashMap<Integer,String>(); 
		     //Map<Integer,String> map=new TreeMap<Integer,String>(); 
		       
		       listOfCustomers.put(15,"Sumeet");      
		       listOfCustomers.put(23,"Akshay");  
		       listOfCustomers.put(4,"Ishan");
		       listOfCustomers.put(35,"Mahesh");     
		             
		       System.out.println(listOfCustomers);
		          
		   	System.out.println("--------------------------");
		       
		       
		       if(!listOfCustomers.containsKey(5))
		       {
		    	   listOfCustomers.put(5, "Anshuman");
		       }
		       
		       listOfCustomers.putIfAbsent(6, "Kuldeep");
		        System.out.println(listOfCustomers);
		    	System.out.println("--------------------------");
		    	
		    	System.out.println(listOfCustomers.containsKey(2));
		    	System.out.println("--------------------------");
		    	
		        System.out.println(listOfCustomers.containsValue("Ravi"));
		    	System.out.println("--------------------------"); 
		    	
		        listOfCustomers.remove(5);
		        System.out.println(listOfCustomers);
		    	System.out.println("--------------------------");
		    	
		        for(Map.Entry me : listOfCustomers.entrySet()){      
			        System.out.println(me.getKey()+" "+me.getValue());      
			       }    
			       
		    }    
}
