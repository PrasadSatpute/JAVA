<%-- 
    Document   : studentProcess
    Created on : Mar 19, 2022, 3:36:46 PM
    Author     : AVENGER'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.example.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String fname,lname,branch,year,contact,address,email;
            fname = request.getParameter("fname");
            lname = request.getParameter("lname");
            branch = request.getParameter("branch");
            year = request.getParameter("year");
            contact = request.getParameter("contact");
            address = request.getParameter("address");
            email = request.getParameter("email");
            StudentImplement obj = new StudentImplement();
            obj.addStudent(fname, lname, branch, year, contact, address, email);
        %>
        <jsp:forward page="student.jsp">
            <jsp:param name="message" value="Record Inserted Successfully"></jsp:param>
        </jsp:forward>
        <%
            
        %>
    </body>
</html>
