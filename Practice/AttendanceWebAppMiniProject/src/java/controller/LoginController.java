///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import businesslogic.DBHandler;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.Servlet;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import model.Person;
//
///**
// *
// * @author user
// */
//public class LoginController implements Servlet{
//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        }
//
//    @Override
//    public ServletConfig getServletConfig() {
//        return null;
//    }
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
//    {
//        PrintWriter pw = res.getWriter();
//        String Username = req.getParameter("user");
//        String Password = req.getParameter("pass");
//        Person person=new Person();
//        person.setUser(Username);
//        person.setPass(Password);
//        DBHandler dBHandler=new DBHandler();
//        dBHandler.checkLogin(person);
//    }
//
//    @Override
//    public String getServletInfo() {
//         return null;
//    }
//
//    @Override
//    public void destroy() {
//        }
//    
//}
