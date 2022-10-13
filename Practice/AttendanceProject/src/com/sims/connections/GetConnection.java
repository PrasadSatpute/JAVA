package com.sims.connections;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetConnection {
    
    public static Connection connection;
    public static Connection getConnection() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/simscollege","root","root");
            return connection;
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        try {
            getConnection();
        } catch (ClassNotFoundException ex) {
            System.out.println("Not Connected");
            Logger.getLogger(GetConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
