/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.services;

import com.project.connector.Connector;
import com.project.dao.iSubject;
import com.project.dto.Student;
import com.project.dto.Subject;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AVENGER'S
 */
public class SubjectImplement implements iSubject{
    
    
    List<Subject> allSubject = new ArrayList<Subject>();
    
    Subject s;
    java.sql.Statement st=Connector.dbCon();
    Connection conn;
    

    @Override
    public boolean addSubject(int teacherID, String subjectName, String subjectDescription) {
        try {
        
        String addSubjectQuery = "INSERT INTO `subjects`(`teacherid`, `name`, `description`) VALUES ('"+teacherID+"','"+subjectName+"','"+subjectDescription+"')";
       
            int i = st.executeUpdate(addSubjectQuery);
            
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
    public boolean deleteSubject(String deleteSubjectName) {
        try {
            String deleteSubjectQuery = "DELETE FROM `subjects` WHERE name = '"+deleteSubjectName+"'";
            
            int i = st.executeUpdate(deleteSubjectQuery);
            
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
    public boolean updateSubject(int updateSubjectID, String updateSubjectName, String updateSubjectDesciption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Subject> getAllSubjectsList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
