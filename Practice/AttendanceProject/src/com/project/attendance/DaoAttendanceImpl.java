/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.attendance;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAttendanceImpl implements AttendaceInterface{

    List<Attedance> attendances;
    
    String line = "";
    String splitBy = ",";
    File file = new File("C:\\Users\\AVENGER'S\\Documents\\NetBeansProjects\\AttendanceProject\\src\\com\\project\\Data.csv");
    BufferedReader br;
    public DaoAttendanceImpl() {
        attendances = new ArrayList<Attedance>();
        
        
        try {
            this.br = new BufferedReader(new FileReader(file));
            try {
                
                System.out.println("AttendanceID"
                +"      "+
                        "Student Code"
                +"      "+
                        "Subject Code"
                +"      "+
                        "Attendace"
                +"      "+
                        "TeacherID");
                
                while ((line = br.readLine()) != null)
                    //returns a Boolean value
                {
                    String[] stdAttendance = line.split(splitBy);
                    //use comma as separator
                    
                    System.out.println(stdAttendance[0]
                            +"      "+
                            stdAttendance[1]
                            +"      "+
                            stdAttendance[2]
                            +"      "+
                            stdAttendance[3]
                            +"      "+
                            stdAttendance[4]
                    );
                }
            } catch (IOException ex) {
                Logger.getLogger(DaoAttendanceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DaoAttendanceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    @Override
    public List<Attedance> getAllAttendance() {
        return attendances;
    }

    @Override
    public Attedance getAttendance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAttendance() {
        Attedance a = new Attedance();
        a.getAttendanceInput();
        attendances.add(a);
        
    }

    @Override
    public void updateAttendace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAttendace() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        DaoAttendanceImpl dimpl = new DaoAttendanceImpl();
    }
    
}









//        try {
//            while ((line = br.readLine()) != null) {
//                String[] studAttendance = line.split(splitBy);
//                attendances.add(new Attedance(studAttendance[0], studAttendance[1], studAttendance[2], studAttendance[3],studAttendance[4]));
//            }
//        } catch (IOException ex) {
//            System.out.println("Null Pointer");
//            Logger.getLogger(DaoAttendanceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }