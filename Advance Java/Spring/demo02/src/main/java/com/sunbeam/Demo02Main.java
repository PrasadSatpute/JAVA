package com.sunbeam;

public class Demo02Main {
	public static void main(String[] args) {
		CustomerDaoImpl dao = new CustomerDaoImpl();
		Customer cust = dao.findById(1);
		System.out.println("Found: "+ cust);
	}
}
