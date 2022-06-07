package set;


import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet
public class EmployeeManager {

	public static void main(String args[]){  
		Set<String> listOfEmployees=new LinkedHashSet<String>();
		
		//Adding elements into the HashSet
		listOfEmployees.add("Sumeet");
		listOfEmployees.add("Akshay");  
		listOfEmployees.add("Mahesh");  
		listOfEmployees.add("Ishan");  
		
		listOfEmployees.add("Sumeet");
		listOfEmployees.add("Akshay"); 
	
		
		System.out.println("Set after adding the elements");
		System.out.println(listOfEmployees);  
		 
		//Remove element from the set
		listOfEmployees.remove("Sumeet");
		listOfEmployees.remove("Akshay");
		System.out.println("--------------------------");
		System.out.println("Set after removing the elements");
		System.out.println(listOfEmployees);  
		
		 
		 //Check element is present in the set
		 System.out.println("--------------------------");
		 System.out.println(listOfEmployees.contains("Sumeet"));
		 System.out.println(listOfEmployees.contains("Mahesh"));
		 
		//Check the size of set
		 System.out.println("--------------------------");
		 System.out.println(listOfEmployees.size());
		 
		 //clear the set
		 System.out.println("--------------------------");
		 listOfEmployees.clear();
		 System.out.println(listOfEmployees);
		 
		 //Check set is empty or not
		 System.out.println("--------------------------");
		 System.out.println(listOfEmployees.isEmpty());
			
			
		}  

}
