/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dao;

import com.project.dto.Attendance;
import com.project.dto.Teacher;
import java.util.List;

public interface iAttendance {
    public boolean addTAttendance(int stdID, String attMark, String stdName, int subID, int tecID, String stdBranch, String stdYear);
    public boolean deleteAttendance(String deleteStudentName);
    public boolean updateAttendance();
    public List<Attendance> getAllAttendanceList();
}
