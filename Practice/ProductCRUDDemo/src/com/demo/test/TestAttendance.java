package com.demo.test;

import java.util.List;
import java.util.Scanner;


import com.demo.service.AttService;
import com.demo.service.AttServiceImpl;

public class TestAttendance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		AttService attService=new AttServiceImpl();
		
		do {
		System.out.println("1. Add Student \n2. Add Teacher \n3. add sunject \n4.Mark Attendance \n");
		System.out.println("5. Generate report \n 6. ------------\n7. Exit\n");
		System.out.println("Choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			int n=attService.addStudent();
			if(n>0) {
				System.out.println("New Student added success!!");
			}
			else {
				System.out.println("Failed to add Student");
			}
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			System.out.println("Thank you for visiting");
			sc.close();
			System.exit(0);
			break;
		default:
			System.out.println("wrong choice");
			break;
		
		}
		
		}while(choice!=7);
		

	}

}
