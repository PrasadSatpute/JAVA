<%-- 
    Document   : addtelephone
    Created on : Mar 19, 2022, 12:27:38 PM
    Author     : AVENGER'S
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username = request.getParameter("txtUserName");
            String telephone = request.getParameter("txtTeleNumber");
            
           //
           Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            Statement st = con.createStatement();
            String qry = "select * from student";
            ResultSet rs = st.executeQuery(qry);

        %>
    </body>
</html>
