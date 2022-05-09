package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int Userid;
	private String name;
	private String phone;
	
	List<Contact> contact = new ArrayList<Contact>();

	public User(int userid, String name, String phone, List<Contact> contact) {
		super();
		Userid = userid;
		this.name = name;
		this.phone = phone;
		this.contact = contact;
	}

	public User(int userid, String name, String phone) {
		super();
		Userid = userid;
		this.name = name;
		this.phone = phone;
	}

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	
	
}
