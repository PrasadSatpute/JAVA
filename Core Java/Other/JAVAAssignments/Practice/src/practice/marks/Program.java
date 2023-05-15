package practice.marks;

import java.util.Scanner;

public class Program {
	
	private static Scanner sc = new Scanner(System.in); 
	private static void acceptRecord(Date birthDate) {
		System.out.print("Day	:	");
		birthDate.setDay(sc.nextInt());
		System.out.print("Month	:	");
		birthDate.setMonth(sc.nextInt());
		System.out.print("Year	:	");
		birthDate.setYear(sc.nextInt());
	}
	private static void printRecord(Date birthDate) {
		System.out.println(birthDate.getDay()+" / "+birthDate.getMonth()+" / "+birthDate.getYear());
	}
	
	private static void acceptRecord(Student student) {
		System.out.print("Name	:	");
		student.setName(sc.nextLine());
		
		System.out.println("Birth Date	:	");
		Date birthDate = student.getDob();
		Program.acceptRecord(birthDate);
		
		System.out.println("ID	:	");
		student.setId(sc.nextInt());
		
		System.out.println("Enter M1 :");
		student.setM1(sc.nextInt());
		
		System.out.println("Enter M2 :");
		student.setM2(sc.nextInt());
		
		System.out.println("Enter M3 :");
		student.setM3(sc.nextInt());
	}
	private static void printRecord(Student student) {
		
		System.out.println("Name		:	"+student.getName());
		System.out.println("ID          :   "+student.getId());
		Date birthDate = student.getDob();
		System.out.print("Birth Date	:	");
		Program.printRecord(birthDate);
		System.out.println("M1          :   "+student.getM1());
		System.out.println("M2          :   "+student.getM2());
		System.out.println("M3          :   "+student.getM3());
		
	}

	public static void main(String[] args) {
		
		Student student = new Student();
		Program.acceptRecord(student);
		Program.printRecord(student);

	}

}
