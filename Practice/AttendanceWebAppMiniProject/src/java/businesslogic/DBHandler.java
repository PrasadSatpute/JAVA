/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import model.Student;

public class DBHandler {

    public boolean insertUserMaster(Student s) {
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "");
            Statement st = con.createStatement();

            String qry = "insert into student values('" +s.getfname()+ "','" + s.getLname() + "','" + s.getBranch() + "','" + s.getYear() + "','" + s.getAddress()+ "','" + s.getEmail() + "','" + s.getContact() + "')";
            i = st.executeUpdate(qry);

        } catch (Exception e) {
        }
        return i > 0 ? true : false;
    }

//    public boolean checkLogin(Person person){
//        boolean flag = false;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servdb", "root", "root");
//            Statement st = con.createStatement();
//
//            String qry = "select * from register where user='"+person.getUser()+"' and pass='"+person.getPass()+"'";
//            ResultSet rs= st.executeQuery(qry);
//            if(rs.next()){
//                flag=true;
//            }
//        } catch (Exception e) {
//        }
//        return flag;
//    }
}
