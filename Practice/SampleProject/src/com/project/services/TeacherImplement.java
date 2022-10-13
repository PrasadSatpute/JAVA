/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.services;

import com.project.connector.Connector;
import com.project.dao.iTeacher;
import com.project.dto.Student;
import com.project.dto.Teacher;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeacherImplement implements iTeacher{
    
    List<Teacher> allStudents = new ArrayList<Teacher>();
    
    Teacher s;
    java.sql.Statement st=Connector.dbCon();
    Connection conn;

    @Override
    public boolean addTeacher(String teacherName, String teacherGender, String teacherAddress) {
        try {
        
        String addTeacherQuery = "INSERT INTO `teachers`(`name`, `gender`, `address`) VALUES ('"+teacherName+"','"+teacherGender+"','"+teacherAddress+"')";
       
            int i = st.executeUpdate(addTeacherQuery);
            
            if(i > 0)
            {
                return true;
            }
            else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return false;
    }

    @Override
    public boolean deleteTeacher(String deleteTeacherName) {
        try {
            String deleteTeacherQuery = "DELETE FROM `teachers` WHERE name = '"+deleteTeacherName+"'";
            
            int i = st.executeUpdate(deleteTeacherQuery);
            
            if (i > 0) {
                return true;
            }else
            {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
            return false;
    }

    @Override
    public boolean updateTeacher(String teacherName, String teacherGender, String teacherAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Teacher> getAllTeacherList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
