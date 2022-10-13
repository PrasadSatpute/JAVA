/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment1;

import java.util.Scanner;

public class DepartmentTest {
    private static Scanner sc = new Scanner(System.in);
	private Department dept;
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public void inputData( ) {
		if( this.dept != null ) {
			System.out.print("Department Name	:	");
			dept.setDeptName(sc.nextLine());
			System.out.print("Department ID	:	");
			dept.setDeptID(sc.nextInt());
			System.out.print("Department Location	:	");
			dept.setDeptLocation(sc.nextLine());
		}
	}
	
	public void showData( ) {
		if( this.dept != null )
			System.out.println(dept.toString());
	}
    
}
