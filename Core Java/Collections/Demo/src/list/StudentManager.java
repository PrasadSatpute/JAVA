package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//ArrayList
public class StudentManager {
	
	public static void main(String args[]){  
		
		String [] studentsName = new String[30];
		/*
		 * studentsName[0]="Sumeet";
		 * studentsName[1]...studentsName[28]
		 * studentsName[29]="Akshay";
		 * 
		 * //New Student studentsName[30]="Sumeet";
		 */
		
		
		
		List<String> listOfStudents=new ArrayList<String>();
		//List<String> list=new LinkedList<String>();
		
		//size=n
		//size = n+ n/2 +1
		
		listOfStudents.add("Sumeet");
		listOfStudents.add("Akshay");  
		listOfStudents.add("Mahesh");  
		listOfStudents.add("Ishan");  
		
		//At particular index
		listOfStudents.add(3, "Anshuman");
		
		System.out.println("List after adding the elements");
		System.out.println(listOfStudents);  
		
		//add another list
		ArrayList<String> listOfStudentsToBeAdded=new ArrayList<String>();
		listOfStudentsToBeAdded.add("Prasad");
		listOfStudentsToBeAdded.add("ravi");
		
		listOfStudents.addAll(listOfStudentsToBeAdded);
		System.out.println("--------------------------------------------------");
		System.out.println("List after adding compelete list to another list");
		System.out.println(listOfStudents);
		 
		 
		//Updating the list
		listOfStudents.set(1, "Kuldeep");
		System.out.println("--------------------------------------------------");
		System.out.println("List after updating the elements");
		System.out.println(listOfStudents);
		
		
		 //Retrieving an element
		 
		 System.out.println("--------------------------------------------------");
		 System.out.println("Retrieving an element from the list");	
		 System.out.println(listOfStudents.get(2));
		 
		 
		//Remove element from the list
		listOfStudents.remove(0);
		listOfStudents.remove(1);
		//list.remove(String.valueOf("Sumeet"));
			
		System.out.println("--------------------------------------------------");
		System.out.println("List after removing the elements");
		System.out.println(listOfStudents);  
			
		//Clearing the list
		listOfStudents.clear();
		System.out.println("--------------------------------------------------");
		System.out.println("List after clearing the elements");
		System.out.println(listOfStudents);
			 
	   //Check element is present or not
		
		System.out.println("--------------------------------------------------");
		System.out.println("Check element is present or not");
		System.out.println(listOfStudents.contains("Ramesh"));
		 
			 
			
		}  
		

}
