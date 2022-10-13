package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Attendance;
import com.demo.beans.Student;
import com.demo.beans.Subject;
import com.demo.beans.Teachers;
import com.demo.dao.AttDao;
import com.demo.dao.AttDaoImpl;

public class AttServiceImpl implements AttService{
	
	AttDao attDao;
	Scanner sc=new Scanner(System.in);
	public AttServiceImpl() {
		attDao=new AttDaoImpl();
	}
	
	
	
	@Override
	public int addStudent() {
		
		System.out.println("Enter rollNo");
		int r=sc.nextInt();
		System.out.println("Enter name ");
		String nm=sc.next();
		System.out.println("Enter Standard of student ");
		String s=sc.next();
		System.out.println("Enter Division of student ");
		String d=sc.next();
		System.out.println("Enter Gender of student ");
		String g=sc.next();
		
		return attDao.save(new Student(r,nm,s,d,g));
	}



	
}
