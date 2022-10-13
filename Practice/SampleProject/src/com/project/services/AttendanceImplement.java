/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.services;

import com.project.connector.Connector;
import com.project.dao.iAttendance;
import com.project.dto.Attendance;
import com.project.dto.Student;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AttendanceImplement implements iAttendance{
    
    List<Attendance> allAttendance = new ArrayList<Attendance>();
    
    Attendance a;
    java.sql.Statement st=Connector.dbCon();
    Connection conn;

    @Override
    public boolean addTAttendance(int stdID, String attMark, String stdName, int subID, int tecID, String stdBranch, String stdYear) {
        try {
        
        String addAttendanceQuery = "INSERT INTO `attendance`(`studentid`, `attendance`, `studentname`, `subjectid`, `teacherid`, `branch`, `year`) VALUES ('"+stdID+"','"+attMark+"','"+stdName+"','"+subID+"','"+tecID+"','"+stdBranch+"','"+stdYear+"')";
       
            int i = st.executeUpdate(addAttendanceQuery);
            
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
    public boolean deleteAttendance(String deleteStudentName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateAttendance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Attendance> getAllAttendanceList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
