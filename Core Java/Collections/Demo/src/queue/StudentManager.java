package queue;

import java.util.ArrayDeque;


//ArrayDeque
public class StudentManager {
	public static void main(String[] args) {

        ArrayDeque<String> listOfStudents = new ArrayDeque<>();

        listOfStudents.offer("Sumeet");
        listOfStudents.offerFirst("Akshay");
        listOfStudents.offerLast("Mahesh");
        listOfStudents.offer("Ishan");

        System.out.println(listOfStudents);
        System.out.println("--------------------------");
        System.out.println(listOfStudents.peek());
        System.out.println(listOfStudents.peekFirst());
        System.out.println(listOfStudents.peekLast());
        
        System.out.println("--------------------------");
        System.out.println(listOfStudents.poll());
        System.out.println("poll() " +listOfStudents);
        
        System.out.println("--------------------------");
        System.out.println(listOfStudents.pollFirst());
        System.out.println("pollFirst() " +listOfStudents);

        System.out.println("--------------------------");
        System.out.println(listOfStudents.pollLast());
        System.out.println("pollLast() " +listOfStudents);

    }

}
