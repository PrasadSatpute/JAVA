package org.sunbeam.dac.model;

public class Customer {
	private String name;
	private String email;
	private String phoneNumber;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String email, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-20s%-15s", this.name, this.email, this.phoneNumber);
	}
}
