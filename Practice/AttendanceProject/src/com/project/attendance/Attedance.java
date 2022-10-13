/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.attendance;

import java.util.Date;
import java.util.Scanner;

public class Attedance {
    private String attendanceID;
    private String studentCode;
    private String subjectCode;
    private String attendaceMark;
    private String teacherID;
    //private Date attendanceDate;

    public Attedance() {
        attendanceID=null;
        studentCode=null;
        subjectCode=null;
        attendaceMark=null;
        teacherID=null;
    }

    public Attedance(String attendanceID, String studentCode, String subjectCode, String attendaceMark, String teacherID) {
        this.attendanceID = attendanceID;
        this.studentCode = studentCode;
        this.subjectCode = subjectCode;
        this.attendaceMark = attendaceMark;
        this.teacherID = teacherID;
    }
    
    

    public String getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(String attendanceID) {
        this.attendanceID = attendanceID;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getAttendaceMark() {
        return attendaceMark;
    }

    public void setAttendaceMark(String attendaceMark) {
        this.attendaceMark = attendaceMark;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public static Scanner sc = new Scanner(System.in);
    
   public void getAttendanceInput(){
       System.out.println("Enter Attednace ID : ");
       attendanceID = sc.nextLine();
       System.out.println("Enter Student Code : ");
       studentCode = sc.nextLine();
       System.out.println("Enter Subject Code : ");
       subjectCode = sc.nextLine();
       System.out.println("Enter Attendace Mark : ");
       attendaceMark = sc.nextLine();
       System.out.println("Enter Subject Teacher Id : ");
       teacherID = sc.nextLine();
   }
    
   public void showAttendanceOutput(){
       System.out.println("AttendanceID"
                +"  "+
                    "Student Code"
                +"  "+
                    "Subject Code"
                +"  "+
                    "Attendace"
                +"  "+
                    "TeacherID");
       System.out.println(attendanceID
                            +"  "+
                            studentCode
                            +"  "+
                            subjectCode
                            +"  "+
                            attendaceMark
                            +"  "+
                            teacherID
                    );
   }
    
}
