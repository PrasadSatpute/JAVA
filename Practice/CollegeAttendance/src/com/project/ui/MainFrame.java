/*
 * Author       : Prasad Satpute
 * Date         : 09/03/2022
 * Program      : College Attendace 
 * Description  : 
 */
package com.project.ui;

import com.project.connector.Connector;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class MainFrame extends javax.swing.JFrame implements Runnable{

    int hh,mm,ss,DD,YYYY,MM;
    
    java.sql.Statement st=Connector.dbCon();
    Connection conn;
    
    
    
    public void setStudentTable(){
        String[] columnName = {"Student ID", "Student Name","Gender", "Address"};
            
            
            DefaultTableModel studentModel = new DefaultTableModel();
            
            
            jTableStudents.setModel(studentModel);
            
            studentModel.setColumnIdentifiers(columnName);
            
            String studentQuery = "select * from students";
            
            ResultSet studentTableRS = null;
        try {
            studentTableRS = st.executeQuery(studentQuery);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            while(studentTableRS.next()) {
                jComboBoxASID1.addItem(studentTableRS.getString(1));
                jComboBoxASID2.addItem(studentTableRS.getString(1));
                studentModel.addRow(new Object[]{studentTableRS.getString(1), studentTableRS.getString(2), studentTableRS.getString(3), studentTableRS.getString(4)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    public void setTeacherTable(){
        String[] columnName = {"Teacher ID", "Teacher Name","Gender", "Address"};
            
            
            DefaultTableModel teacherModel = new DefaultTableModel();
            
            
            jTableTeachers.setModel(teacherModel);
            
            teacherModel.setColumnIdentifiers(columnName);
            
            String teacherQuery = "select * from teachers";
            
            ResultSet teacherTableRS = null;
        try {
            teacherTableRS = st.executeQuery(teacherQuery);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            while(teacherTableRS.next()) {
                
                jComboBoxSubjectsList.addItem(teacherTableRS.getString(1));
                teacherModel.addRow(new Object[]{teacherTableRS.getString(1), teacherTableRS.getString(2), teacherTableRS.getString(3), teacherTableRS.getString(4)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void setSubjectTable(){
        String[] columnName = {"Subject ID", "Subject Name","Teacher ID", "Description"};
            
            
            DefaultTableModel subjectModel = new DefaultTableModel();
            
            
            jTableSubjects.setModel(subjectModel);
            
            subjectModel.setColumnIdentifiers(columnName);
            
            String subjectQuery = "select * from subjects";
            
            ResultSet subjectTableRS = null;
        try {
            subjectTableRS = st.executeQuery(subjectQuery);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            while(subjectTableRS.next()) {
                jComboBoxASNAME1.addItem(subjectTableRS.getString(3));
                subjectModel.addRow(new Object[]{subjectTableRS.getString(1), subjectTableRS.getString(2), subjectTableRS.getString(3), subjectTableRS.getString(4)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    public void setAttendanceTable(){
        String[] columnName = {"Attendance ID", "Student ID","Attendance","Student Name","Gender","Subject ID","Teacher ID"};
            
            
            DefaultTableModel AttendanceModel = new DefaultTableModel();
            
            
            jTableAttendance.setModel(AttendanceModel);
            
            AttendanceModel.setColumnIdentifiers(columnName);
            
            String AttendanceQuery = "select * from attendance";
            
            ResultSet AttendanceTableRS = null;
        try {
            AttendanceTableRS = st.executeQuery(AttendanceQuery);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            while(AttendanceTableRS.next()) {
                
                AttendanceModel.addRow(new Object[]{AttendanceTableRS.getString(1), AttendanceTableRS.getString(2), AttendanceTableRS.getString(3), AttendanceTableRS.getString(4),AttendanceTableRS.getString(5),AttendanceTableRS.getString(6),AttendanceTableRS.getString(7)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    
    public void AttendaceTeacherName(){
        try {
            
            String getSubjectName = (String) jComboBoxASNAME1.getSelectedItem();
            String TeacherNameQuery = "SELECT teachers.name FROM teachers INNER JOIN subjects ON teachers.teacherid = subjects.teacherid WHERE subjects.name = '"+getSubjectName+"'";
            
            ResultSet TeacherNameRS = st.executeQuery(TeacherNameQuery);
            
            while (TeacherNameRS.next()) {
                //jComboBoxATN1.addItem(TeacherNameRS.getString(2));
            }
        } catch (Exception e) {
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public MainFrame() {
        initComponents();
        Thread t = new Thread(this);
        t.start();
        
        
        try {
            
            setStudentTable();
            setTeacherTable();
            setSubjectTable();
            setAttendanceTable();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTime = new javax.swing.JLabel();
        jDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableAttendance = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnAddAttendance = new javax.swing.JButton();
        jComboBoxASID1 = new javax.swing.JComboBox<>();
        jComboBoxAttendance1 = new javax.swing.JComboBox<>();
        jComboBoxASNAME1 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxASID2 = new javax.swing.JComboBox<>();
        btnDeleteAttendance = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTeachers = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTeacherName = new javax.swing.JTextField();
        txtTeacherGender = new javax.swing.JTextField();
        btnAddTeacher = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtTeacherAddress = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudents = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        txtStudentGender = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtStudentAddress = new javax.swing.JTextArea();
        btnAddStudent = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSubjects = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSubjectName = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtSubjectDescription = new javax.swing.JTextArea();
        jComboBoxSubjectsList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COLLEGE ATTENDANCE");

        jTableAttendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attendance ID", "Student ID", "Attendance", "Student Name", "Gender", "Subject ID", "Teacher ID"
            }
        ));
        jScrollPane7.setViewportView(jTableAttendance);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Student ID");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Attendance");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Subject Name");

        btnAddAttendance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddAttendance.setText("Add Attendance");
        btnAddAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddAttendanceMouseClicked(evt);
            }
        });
        btnAddAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAttendanceActionPerformed(evt);
            }
        });

        jComboBoxAttendance1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxAttendance1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "L", "A" }));

        jComboBoxASNAME1.setAutoscrolls(true);
        jComboBoxASNAME1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxASNAME1.setKeySelectionManager(null);
        jComboBoxASNAME1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxASNAME1ItemStateChanged(evt);
            }
        });
        jComboBoxASNAME1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxASNAME1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnAddAttendance))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxASID1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxAttendance1, 0, 123, Short.MAX_VALUE)
                            .addComponent(jComboBoxASNAME1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxASID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxAttendance1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxASNAME1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnAddAttendance)
                .addGap(42, 42, 42))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Student ID");

        btnDeleteAttendance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteAttendance.setText("Delete Attendance");
        btnDeleteAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteAttendanceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxASID2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxASID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteAttendance)
                .addGap(45, 45, 45))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("ATTENDANCE", jPanel1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("TEACHERS");

        jTableTeachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "Teacher Name", "Gender", "Address"
            }
        ));
        jScrollPane3.setViewportView(jTableTeachers);

        jLabel7.setText("Name");

        jLabel8.setText("Gender");

        jLabel9.setText("Address");

        btnAddTeacher.setText("Add Teacher");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        txtTeacherAddress.setColumns(20);
        txtTeacherAddress.setRows(5);
        jScrollPane4.setViewportView(txtTeacherAddress);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTeacherGender)
                                    .addComponent(txtTeacherName)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnAddTeacher)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTeacherGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(btnAddTeacher)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TEACHER", jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("STUDENTS");

        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Gender", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTableStudents);

        jLabel3.setText("Name");

        jLabel4.setText("Gender");

        jLabel5.setText("Address");

        txtStudentAddress.setColumns(20);
        txtStudentAddress.setRows(5);
        jScrollPane2.setViewportView(txtStudentAddress);

        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStudentName)
                            .addComponent(txtStudentGender)
                            .addComponent(btnAddStudent)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtStudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddStudent)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("STUDENT", jPanel3);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("SUBJECTS");

        jTableSubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject ID", "Teacher ID", "Subject Name", "Description"
            }
        ));
        jScrollPane5.setViewportView(jTableSubjects);

        jLabel11.setText("Subject Name");

        jLabel12.setText("Desciption");

        jLabel13.setText("Assign Teacher");

        jButton1.setText("Add Subject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSubjectDescription.setColumns(20);
        txtSubjectDescription.setRows(5);
        jScrollPane6.setViewportView(txtSubjectDescription);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(64, 64, 64))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(57, 57, 57)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxSubjectsList, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(txtSubjectName)))
                            .addComponent(jButton1))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jComboBoxSubjectsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addComponent(jButton1)
                        .addGap(115, 115, 115))))
        );

        jTabbedPane1.addTab("SUBJECT", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(265, 265, 265)
                .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        // TODO add your handling code here:

        try {
            String sName = txtStudentName.getText();
            String sGender = txtStudentGender.getText();
            String sAddress = txtStudentAddress.getText();

            if(sName.equals("") || sGender.equals("") || sAddress.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please Fill All the Fields");
            }

            else{

                String qry = "INSERT INTO students(name, gender, address) VALUES ('"+sName+"','"+sGender+"','"+sAddress+"')";

                int i = st.executeUpdate(qry);

                if(i > 0)
                {
                    JOptionPane.showMessageDialog(this, "Student Inserted");
                    txtStudentName.setText("");
                    txtStudentGender.setText("");
                    txtStudentAddress.setText("");
                    setStudentTable();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Not Inserted");
        }
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        // TODO add your handling code here:
        try {
            String tName = txtTeacherName.getText();
            String tGender = txtTeacherGender.getText();
            String tAddress = txtTeacherAddress.getText();

            if(tName.equals("") || tGender.equals("") || tAddress.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please Fill All the Fields");
            }

            else{

                String qry = "INSERT INTO teachers(name, gender, address) VALUES ('"+tName+"','"+tGender+"','"+tAddress+"')";

                int i = st.executeUpdate(qry);

                if(i > 0)
                {
                    JOptionPane.showMessageDialog(this, "Teacher Inserted");
                    txtTeacherName.setText("");
                    txtTeacherGender.setText("");
                    txtTeacherAddress.setText("");
                    setTeacherTable();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Not Inserted");
        }
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            String subName = txtSubjectName.getText();
            String subDescription = txtSubjectDescription.getText();
            String subTeachetID = (String) jComboBoxSubjectsList.getSelectedItem();

            if(subName.equals("") || subDescription.equals("") )
            {
                JOptionPane.showMessageDialog(this, "Please Fill All the Fields");
            }

            else{

                String qry = "INSERT INTO subjects(teacherid, name, description) VALUES ('"+subTeachetID+"','"+subName+"','"+subDescription+"')";

                int i = st.executeUpdate(qry);

                if(i > 0)
                {
                    JOptionPane.showMessageDialog(this, "Subject Inserted");
                    txtSubjectName.setText("");
                    txtSubjectDescription.setText("");
                    setSubjectTable();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Not Inserted");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxASNAME1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxASNAME1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxASNAME1ActionPerformed

    private void jComboBoxASNAME1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxASNAME1ItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxASNAME1ItemStateChanged

    private void btnAddAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAttendanceMouseClicked
        // TODO add your handling code here:
        
        try {
            
            String getAttendanceStudentID = (String) jComboBoxASID1.getSelectedItem();
            String getAttendance = (String) jComboBoxAttendance1.getSelectedItem();
            String getAttendaceSubjectName = (String) jComboBoxASNAME1.getSelectedItem();
            
            String getAttendanceStudentName = null,getAttendanceStudentGender = null;
            String getAttendanceSubjectID = null,getAttendanceTeacherID = null;
            
            String getStudentInfo = "select * from students where rollNo = '"+getAttendanceStudentID+"'";
            
            ResultSet AttendanceStudentRS = st.executeQuery(getStudentInfo);
            
            while (AttendanceStudentRS.next()) {
                getAttendanceStudentName = AttendanceStudentRS.getString(2);
                getAttendanceStudentGender=AttendanceStudentRS.getString(3);
            }
            
            String getSubTeacherInfo = "SELECT * FROM `subjects` WHERE name = '"+getAttendaceSubjectName+"'";
            
            ResultSet AttendanceSubjectRS = st.executeQuery(getSubTeacherInfo);
            
            while (AttendanceSubjectRS.next()) {
                getAttendanceSubjectID = AttendanceSubjectRS.getString(1);
                getAttendanceTeacherID=AttendanceSubjectRS.getString(2);
            }
            
            String AddAttendanceQuery = "INSERT INTO `attendance`(`studentid`, `attendance`, `studentname`, `gender`, `subjectid`, `teacherid`) VALUES ('"+getAttendanceStudentID+"','"+getAttendance+"','"+getAttendanceStudentName+"','"+getAttendanceStudentGender+"','"+getAttendanceSubjectID+"','"+getAttendanceTeacherID+"')";
            
            int i = st.executeUpdate(AddAttendanceQuery);

                if(i > 0)
                {
                    JOptionPane.showMessageDialog(this, "Attendance Inserted");
                    setAttendanceTable();
                    
                }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Not Inserted");
        }
        
    }//GEN-LAST:event_btnAddAttendanceMouseClicked

    private void btnDeleteAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAttendanceMouseClicked
        // TODO add your handling code here:
        try {
            
            String deleteAttedanceStudentID = (String) jComboBoxASID2.getSelectedItem();
            
            String DeleteAttendaceQuery = "DELETE FROM `attendance` WHERE studentid = '"+deleteAttedanceStudentID+"'";
            
            int i = st.executeUpdate(DeleteAttendaceQuery);
            
            if(i > 0)
            {
                JOptionPane.showMessageDialog(this, "Attendance Deleted");
                setAttendanceTable();
            }
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteAttendanceMouseClicked

    private void btnAddAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAttendanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAttendanceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    @Override
    public void run() {
        while(true)
        {
            try {
            
                Calendar c =Calendar.getInstance();
                
                hh = c.get(Calendar.HOUR_OF_DAY);
                if(hh>12)
                {
                    hh = hh -12;
                }
                mm = c.get(Calendar.MINUTE);
                ss = c.get(Calendar.SECOND);
                
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                Date dt = c.getTime();
                String timer = sdf.format(dt);
                jTime.setText(timer);
                
                DD = c.get(Calendar.DAY_OF_MONTH);
                MM = c.get(Calendar.MONTH);
               YYYY = c.get(Calendar.YEAR);
                
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String day = df.format(dt);
                jDate.setText(day);
                
            } catch (Exception e) {
            
            
            
            }
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAttendance;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnDeleteAttendance;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxASID1;
    private javax.swing.JComboBox<String> jComboBoxASID2;
    private javax.swing.JComboBox<String> jComboBoxASNAME1;
    private javax.swing.JComboBox<String> jComboBoxAttendance1;
    private javax.swing.JComboBox<String> jComboBoxSubjectsList;
    private javax.swing.JLabel jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAttendance;
    private javax.swing.JTable jTableStudents;
    private javax.swing.JTable jTableSubjects;
    private javax.swing.JTable jTableTeachers;
    private javax.swing.JLabel jTime;
    private javax.swing.JTextArea txtStudentAddress;
    private javax.swing.JTextField txtStudentGender;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextArea txtSubjectDescription;
    private javax.swing.JTextField txtSubjectName;
    private javax.swing.JTextArea txtTeacherAddress;
    private javax.swing.JTextField txtTeacherGender;
    private javax.swing.JTextField txtTeacherName;
    // End of variables declaration//GEN-END:variables
}
