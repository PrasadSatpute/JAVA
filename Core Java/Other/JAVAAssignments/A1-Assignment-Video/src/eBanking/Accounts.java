package eBanking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Accounts {
	
	String accNumber, name, email, phone;
	Double balance;
	static Scanner sc = new Scanner(System.in);
	
	public Accounts(String accNumber, String name, String email, String phone, Double balance) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}

	public Accounts() {
		// TODO Auto-generated constructor stub
	}

	void addAccount() {
		System.out.println("Enter User Name : ");
		name = sc.nextLine();
		System.out.println("Enter Account Number : ");
		accNumber = sc.nextLine();
		System.out.println("Enter Email : ");
		email = sc.nextLine();
		System.out.println("Enetr phone : ");
		phone = sc.nextLine();
		System.out.println("Enter balance : ");
		balance = sc.nextDouble();
	}
	
	
	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Accounts [accNumber=" + accNumber + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", balance=" + balance + "]";
	}

	
}
