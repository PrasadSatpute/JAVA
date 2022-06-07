package queue;

import java.util.LinkedList;
import java.util.Queue;


//LinkedList
public class EmployeeManager {
	public static void main(String args[])
    {
        Queue<String> listOfEmployees = new LinkedList<String>();
        //Adding elements into the queue
        listOfEmployees.offer("Sumeet");
		listOfEmployees.offer("Akshay");  
		listOfEmployees.offer("Mahesh");  
		listOfEmployees.offer("Ishan");  
		
		
		System.out.println("Queue after adding the elements");
		System.out.println(listOfEmployees);  
	
		//Removing element from the queue
		System.out.println("--------------------------");
		System.out.println("Queue after removing the elements");
		System.out.println(listOfEmployees.poll());
		
		System.out.println("**************************");
		
		System.out.println("Element that is removed from queue"); 
		System.out.println(listOfEmployees); 
		
		System.out.println("--------------------------");
		System.out.println(listOfEmployees.peek());
		 
		 
    }

}
