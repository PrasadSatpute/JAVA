package com.demo.beans;

public class Teachers {
	private int empId;
	private int teacherId;
	private String tName;
	private String gender;
	public Teachers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teachers(int empId, int teacherId, String tName, String gender) {
		super();
		this.empId = empId;
		this.teacherId = teacherId;
		this.tName = tName;
		this.gender = gender;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Teachers [empId=" + empId + ", teacherId=" + teacherId + ", tName=" + tName + ", gender=" + gender
				+ "]";
	}
	
	
	
}
