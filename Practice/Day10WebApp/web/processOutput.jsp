<%-- 
    Document   : processOutput
    Created on : Mar 19, 2022, 11:43:30 AM
    Author     : AVENGER'S
--%>

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
            String password = request.getParameter("txtPassword");
            String email = request.getParameter("txtEmail");
        %>
        
        <jsp:useBean id="userbean" scope="page" class="com.example.user" />
        
        <jsp:setProperty name="userbean" property="username" value= "<%=username%>" />
        <jsp:setProperty name="userbean" property="password" value= "<%=password%>" />
        <jsp:setProperty name="userbean" property="email" value= "<%=email%>" />
        
        <table border="1">
            <thead>
                <tr>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td></td>
                    <td><jsp:getProperty name="userbean" property="username" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><jsp:getProperty name="userbean" property="password" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><jsp:getProperty name="userbean" property="email" /></td>
                </tr>
            </tbody>
        </table>

        
        
        
        
    </body>
</html>
