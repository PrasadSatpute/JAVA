/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import businesslogic.DBHandler;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import model.Student;

/**
 *
 * @author user
 */
public class Registration implements Servlet
{

    @Override
    public void init(ServletConfig config) throws ServletException {
        }

    @Override
    public ServletConfig getServletConfig() 
    {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {   
        PrintWriter pw = res.getWriter();
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String branch = req.getParameter("branch");
        String year = req.getParameter("year");
        String address = req.getParameter("address");
        String email = req.getParameter("email");
        String contact = req.getParameter("contact");
        int cContact = Integer.parseInt(contact);
        DBHandler db=new DBHandler();
        Student s = new Student(fname, lname, branch, year, cContact, email, address);
        boolean flag=db.insertUserMaster(s);
        if(flag){
            RequestDispatcher rd=req.getRequestDispatcher("Success.jsp");
            rd.forward(req, res);
        }else{
            RequestDispatcher rd=req.getRequestDispatcher("Error.jsp");
            rd.forward(req, res);
        }
    }

    @Override
    public String getServletInfo() 
    {   
        return null;
    }

    @Override
    public void destroy() {
        }
    
}
