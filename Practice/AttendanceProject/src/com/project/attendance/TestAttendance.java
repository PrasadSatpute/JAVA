/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.attendance;

import java.util.Scanner;

public class TestAttendance {
    public static void main(String[] args) {
        DaoAttendanceImpl attendanceDao = new DaoAttendanceImpl();
        
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        do
        {
            System.out.println("1. Add Attendance");
            System.out.println("2. Show Attendance");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                    attendanceDao.addAttendance();
                    break;
                case 2 :
                    for(Attedance att : attendanceDao.getAllAttendance())
                        {
                            System.out.println("    "+att.getAttendanceID());
                        }
                    break;
            }
            
        }while(choice != 0);
        
        for(Attedance att : attendanceDao.getAllAttendance())
        {
            att.showAttendanceOutput();
        }
    }
}
