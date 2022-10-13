/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.connector;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Connector {

    public static java.sql.Statement dbCon() {
        java.sql.Statement st=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            st = con.createStatement();
            String qry = "select * from students";
            ResultSet rs = st.executeQuery(qry);
            if(rs.first()){
                System.out.println("Connection Is Done");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return st;
    }
    
    public static void main(String[] args) {
        dbCon();
    }
   
}
