/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentImplement implements iStudent{

    Connection conn;
    ResultSet rs;
    java.sql.PreparedStatement ps;
    Statement st;
    public StudentImplement() {
        try {
            String url="jdbc:mysql://localhost:3306/projectdb";
            String uname="root";
            String password="";
           
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, uname,password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentImplement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void addStudent(String fname, String lname, String branch, String year, String contact, String address, String email) {
        try {
            String insertQuery = "INSERT INTO student VALUES (?,?,?,?,?,?,?)";
            ps = (PreparedStatement) conn.prepareStatement(insertQuery);
            ps.setString(2, fname);
            ps.setString(3, lname);
            ps.setString(4, branch);
            ps.setString(5, year);
            ps.setString(6, email);
            ps.setString(7, address);
            ps.setString(8, contact);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public boolean deleteStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public cStudent getStudent(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<cStudent> getAllStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
