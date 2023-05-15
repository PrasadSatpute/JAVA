package org.sunbeam.dac.test;

import org.sunbeam.dac.model.Student;
import org.sunbeam.dac.model.Test;

public class Program {
	public static void main5(String[] args) {
		Test test = new Test();
		test.f5();
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.f4();
	}
	public static void main3(String[] args) {
		EmployeeTest test = new EmployeeTest();
		test.f3();	//OK
	}
	public static void main2(String[] args) {
		Employee emp = new Employee();
		emp.f2();	//OK
	}
	public static void main1(String[] args) {
		Person p1 = new Person();
		p1.f1();	//OK
	}
}
