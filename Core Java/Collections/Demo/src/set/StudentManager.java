package set;

import java.util.Set;
import java.util.TreeSet;


//TreeSet
public class StudentManager {
	public static void main(String[] args) {
		
	
	Set<String> listOfStudents=new TreeSet<String>();
	

	
	//Adding elements into the HashSet
	listOfStudents.add("Sumeet");
	listOfStudents.add("Akshay");  
	listOfStudents.add("Mahesh");  
	listOfStudents.add("Ishan");  
	
	listOfStudents.add("Sumeet");
	listOfStudents.add("Akshay"); 

	
	System.out.println("Set after adding the elements");
	System.out.println(listOfStudents);  
	 
	//Remove element from the set
	listOfStudents.remove("Sumeet");
	listOfStudents.remove("Akshay");
	System.out.println("--------------------------");
	System.out.println("Set after removing the elements");
	System.out.println(listOfStudents);  
	
	 
	 //Check element is present in the set
	 System.out.println("--------------------------");
	 System.out.println(listOfStudents.contains("Sumeet"));
	 System.out.println(listOfStudents.contains("Mahesh"));
	 
	 //clear the set
	 System.out.println("--------------------------");
	 listOfStudents.clear();
	 System.out.println(listOfStudents);
	
		
		
	}  

}
