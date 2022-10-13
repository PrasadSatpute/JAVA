/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment1;

import java.util.Scanner;

public class EmployeeTest {
	private static Scanner sc = new Scanner(System.in);
	private Employee emp;
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public void inputData( ) {
		if( this.emp != null ) {
			System.out.print("Name	:	");
			emp.setEmpName(sc.nextLine());
			System.out.print("Empid	:	");
			emp.setEmpid(sc.nextInt());
			System.out.print("Salary	:	");
			emp.setEmpSalary(sc.nextFloat());
                        System.out.print("Post	:	");
                        emp.setEmpPost(sc.nextLine());
                        System.out.print("Department	:	");
                        emp.setEmpDepartment(sc.nextLine());
		}
	}
	
	public void showData( ) {
		if( this.emp != null )
			System.out.println(emp.toString());
	}
	
}