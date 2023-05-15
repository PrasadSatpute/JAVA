package org.sunbeam.dac.test;

import java.util.Scanner;

//Test => Resource Type
class Test implements AutoCloseable{
	public Test( ) {
		System.out.println("Inside constructor");
		//open resource
	}

	@Override
	public void close() throws Exception {
		System.out.println("Inside close method");
		//close resource
	}
}
public class Program {
	public static void main(String[] args) {
		Scanner sc = null;
		sc = new Scanner(System.in);
	}
	public static void main1(String[] args) {
		Test t = null;	//Object reference / reference
		t = new Test( );	//Instance => Resource
	}
}
