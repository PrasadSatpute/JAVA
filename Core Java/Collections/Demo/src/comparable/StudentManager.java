package comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
	
	public static void main(String[] args) {

        List<Integer> listOfStudents = new ArrayList<>();
        listOfStudents.add(34);
        listOfStudents.add(12);
        listOfStudents.add(9);
        listOfStudents.add(9);
        listOfStudents.add(9);
        listOfStudents.add(76);
        listOfStudents.add(29);
        listOfStudents.add(75);

        System.out.println("min element " + Collections.min(listOfStudents));
        System.out.println("max element " + Collections.max(listOfStudents));
        System.out.println(Collections.frequency(listOfStudents, 9));

        Collections.sort(listOfStudents);

       System.out.println(listOfStudents);
       
       Collections.sort(listOfStudents, Comparator.reverseOrder());

       System.out.println(listOfStudents);
       
       System.out.println("****************************************");
       
       List<Student> newListOfStudents = new ArrayList<>();

       newListOfStudents.add(new Student("Sumeet", 2));
       newListOfStudents.add(new Student("Akshay", 4));
       newListOfStudents.add(new Student("Mahesh", 3));
       newListOfStudents.add(new Student("Ishan", 1));

       Student s1 = new Student("Sumeet", 2);
       Student s2 = new Student("Kuldeep",2);
       
       
       System.out.println("Comparing student");
       System.out.println((s1.compareTo(s2)));
       
       System.out.println("------------------------------------------");
       System.out.println("Original List");
       System.out.println(newListOfStudents);
       
       System.out.println("------------------------------------------");
       System.out.println("Sorted List based on rollno");
       Collections.sort(newListOfStudents);
       System.out.println(newListOfStudents);

       System.out.println("------------------------------------------");
       System.out.println("Sorted List based on name");
       Collections.sort(newListOfStudents, (o1, o2) -> o1.name.compareTo(o2.name));

       System.out.println(newListOfStudents);
       
       
       Collections.sort(newListOfStudents, new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
	});
       System.out.println("------------------------------------------");
       System.out.println(newListOfStudents);

    }

}
