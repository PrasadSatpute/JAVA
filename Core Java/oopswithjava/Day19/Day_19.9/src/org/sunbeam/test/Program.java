package org.sunbeam.test;

import java.lang.annotation.Annotation;

import org.sunbeam.model.Employee;

public class Program {
	public static void main(String[] args) {
		//TODO : Use reflection 
		Class<?> c = Employee.class;
		Annotation[] annotations = c.getDeclaredAnnotations();
		//TODO
		
		/*
			   CREATE TBALE employees
			   (
			   		emp_name VARCHAR( 50 ),
			   		emp_id INT,
			   		sal FLOAT,
			   		PRIMARY KEY(emp_id)
			   );
		 */
	}

}
