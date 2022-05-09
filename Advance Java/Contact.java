package com.user.entity;

public class Contact {
	private int cID;
	private String email;
	private String contactName;
	private Long UserID;
	
	public Contact() {
		super();
	}

	public Contact(int cID, String email, String contactName, Long userID) {
		super();
		this.cID = cID;
		this.email = email;
		this.contactName = contactName;
		UserID = userID;
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getUserID() {
		return UserID;
	}

	public void setUserID(Long userID) {
		UserID = userID;
	}
	
	
	
}
