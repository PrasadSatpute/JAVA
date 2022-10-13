package com.demo.beans;

public class Subject {
	private int subCode;
	private int teacherId;
	private String discription;
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subCode, int teacherId, String discription) {
		super();
		this.subCode = subCode;
		this.teacherId = teacherId;
		this.discription = discription;
	}
	public int getSubCode() {
		return subCode;
	}
	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", teacherId=" + teacherId + ", discription=" + discription + "]";
	}
	
	
}
