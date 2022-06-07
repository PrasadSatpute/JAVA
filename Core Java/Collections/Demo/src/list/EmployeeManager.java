package list;

import java.util.Stack;

//Stack
public class EmployeeManager {
	

    public static void main(String[] args) {
        Stack<String> listOfEmployees= new Stack<>();
        
        //Adding element into the stack
        listOfEmployees.push("Sumeet");
        listOfEmployees.push("Akshay");
        listOfEmployees.push("Mahesh");
        listOfEmployees.push("Ishan");
        System.out.println("Stack: " + listOfEmployees);
        
        
        //Check which element is at the top of stack
        System.out.println(listOfEmployees.peek());


        //Removing element from the top
        listOfEmployees.pop();

        System.out.println("Stack: " + listOfEmployees);

        System.out.println(listOfEmployees.peek());
    }

}
