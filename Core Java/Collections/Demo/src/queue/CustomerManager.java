package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//PriotityQueue
public class CustomerManager {
	public static void main(String args[]){  
		Queue<String> listOfCustomers=new PriorityQueue<String>();
		
		//Add elements into the queue
		listOfCustomers.offer("Sumeet");
		listOfCustomers.offer("Akshay");  
		listOfCustomers.offer("Mahesh");  
		listOfCustomers.offer("Ishan");  
		
		System.out.println("Queue after adding the elements");
		System.out.println(listOfCustomers);  
		 
		//Removing an element from queue
		listOfCustomers.poll();
		System.out.println("--------------------------");
		System.out.println("Queue after removing the elements");
			
		System.out.println(listOfCustomers);  
		
		
		//Reversing using comparator
		System.out.println("*********************************");
		Queue<String> newListOfCustomers=new PriorityQueue<String>(Comparator.reverseOrder());
		
		//Add elements into the queue
		newListOfCustomers.offer("Sumeet");
		newListOfCustomers.offer("Akshay");  
		newListOfCustomers.offer("Mahesh");  
		newListOfCustomers.offer("Ishan");  
		
		System.out.println("Queue after adding the elements");
		System.out.println(newListOfCustomers);  
		 
		//Removing an element from queue
		newListOfCustomers.poll();
		System.out.println("--------------------------");
		System.out.println("Queue after removing the elements");
			
		System.out.println(newListOfCustomers);  
			
		}  

}
