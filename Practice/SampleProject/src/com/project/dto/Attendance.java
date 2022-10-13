/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dto;

public class Attendance {
    
    private int attendanceID;
    private int studentID;
    
    private String AttendaceMark;
    private String studentName;
    
    private int subjectID;
    private int teacherID;
    
    private String studentBranch;
    private String studentYear;

    public Attendance() {
    }

    public Attendance(int attendanceID, int studentID, String AttendaceMark, String studentName, int subjectID, int teacherID, String studentBranch, String studentYear) {
        this.attendanceID = attendanceID;
        this.studentID = studentID;
        this.AttendaceMark = AttendaceMark;
        this.studentName = studentName;
        this.subjectID = subjectID;
        this.teacherID = teacherID;
        this.studentBranch = studentBranch;
        this.studentYear = studentYear;
    }

    public int getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(int attendanceID) {
        this.attendanceID = attendanceID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getAttendaceMark() {
        return AttendaceMark;
    }

    public void setAttendaceMark(String AttendaceMark) {
        this.AttendaceMark = AttendaceMark;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }
    
    
    
    
    
}
