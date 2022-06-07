package set;

import java.util.HashSet;
import java.util.Set;

//HashSet
public class CustomerManager {

	public static void main(String args[]){  
		Set<String> listOfCustomers=new HashSet<String>();
		
		//Adding elements into the HashSet
		listOfCustomers.add("Sumeet");
		listOfCustomers.add("Akshay");  
		listOfCustomers.add("Mahesh");  
		listOfCustomers.add("Ishan");  
		
		listOfCustomers.add("Sumeet");
		listOfCustomers.add("Akshay"); 
	
		
		System.out.println("Set after adding the elements");
		System.out.println(listOfCustomers);  
		 
		//Remove element from the set
		listOfCustomers.remove("Sumeet");
		listOfCustomers.remove("Akshay");
		System.out.println("--------------------------");
		System.out.println("Set after removing the elements");
		System.out.println(listOfCustomers);  
		
		 
		 //Check element is present in the set
		 System.out.println("--------------------------");
		 System.out.println(listOfCustomers.contains("Sumeet"));
		 System.out.println(listOfCustomers.contains("Mahesh"));
		 
		 //Check the size of set
		 System.out.println("--------------------------");
		 System.out.println(listOfCustomers.size());
		 
		 //clear the set
		 System.out.println("--------------------------");
		 listOfCustomers.clear();
		 System.out.println(listOfCustomers);
		 
		 //Check set is empty or not
		 System.out.println("--------------------------");
		 System.out.println(listOfCustomers.isEmpty());
		 
		
//		 Set<Student> newlistOfCustomers=new HashSet<Student>();
//		 newlistOfCustomers.add(new Student("Sumeet",5));
//		 newlistOfCustomers.add(new Student("Akshay",25));
//		 newlistOfCustomers.add(new Student("Mahesh",15));
//		 newlistOfCustomers.add(new Student("Ishan",55));
//		 newlistOfCustomers.add(new Student("Prasad",75));
//		 
//		 newlistOfCustomers.add(new Student("Sumeet",5));
//		 newlistOfCustomers.add(new Student("Akshay",25));
//		 
//		 System.out.println("--------------------------");
//		 System.out.println(newlistOfCustomers);
		 
			
		}  
		

}
