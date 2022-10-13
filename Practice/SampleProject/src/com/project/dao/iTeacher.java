/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dao;

import com.project.dto.Student;
import com.project.dto.Teacher;
import java.util.List;

public interface iTeacher {
    public boolean addTeacher(String teacherName, String teacherGender, String teacherAddress);
    public boolean deleteTeacher(String deleteTeacherName);
    public boolean updateTeacher(String teacherName, String teacherGender, String teacherAddress);
    public List<Teacher> getAllTeacherList();
}
