package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.beans.Attendance;
import com.demo.beans.Student;
import com.demo.beans.Subject;
import com.demo.beans.Teachers;

public class AttDaoImpl implements AttDao {
	private static Connection con;
	private static PreparedStatement pinst;
	static {
		con = DBUtils.getMyConnection();
		try {
			pinst = con.prepareStatement("insert into Student values(?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int save(Student student) {

		try {
			pinst.setInt(1, student.getRollNo());
			pinst.setString(2, student.getName());
			pinst.setString(3, student.getStd());
			pinst.setString(4, student.getDivision());
			pinst.setString(5, student.getGender());
			return pinst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
