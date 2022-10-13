package com.demo.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Attendance {
	private int attId=0;
	private int rollNo;
	private int subCode;
	private String attendance;
	private String  dateOfAtt;
	private int teacherCode;
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendance(int rollNo, int subCode, String attendance, int teacherCode) {
		super();
		this.rollNo = rollNo;
		this.subCode = subCode;
		this.attendance = attendance;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date();  
		this.dateOfAtt = formatter.format(date);
		this.teacherCode = teacherCode;
	}
	public int getAttId() {
		return attId;
	}
	public void setAttId(int attId) {
		this.attId = attId;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getSubCode() {
		return subCode;
	}
	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	public String getDateOfAtt() {
		return dateOfAtt;
	}
	public void setDateOfAtt(String dateOfAtt) {
		this.dateOfAtt = dateOfAtt;
	}
	public int getTeacherCode() {
		return teacherCode;
	}
	public void setTeacherCode(int teacherCode) {
		this.teacherCode = teacherCode;
	}
	@Override
	public String toString() {
		return "Attendance [attId=" + attId + ", rollNo=" + rollNo + ", subCode=" + subCode + ", attendance="
				+ attendance + ", dateOfAtt=" + dateOfAtt + ", teacherCode=" + teacherCode + "]";
	}
	
	
}
