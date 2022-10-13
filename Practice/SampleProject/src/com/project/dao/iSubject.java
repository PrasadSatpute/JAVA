/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.dao;

import com.project.dto.Student;
import com.project.dto.Subject;
import java.util.List;

public interface iSubject {
    public boolean addSubject(int teacherID, String subjectName, String subjectDescription);
    public boolean deleteSubject(String deleteSubjectName);
    public boolean updateSubject(int updateSubjectID, String updateSubjectName , String updateSubjectDesciption);
    public List<Subject> getAllSubjectsList();
}
