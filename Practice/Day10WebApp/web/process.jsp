<%-- 
    Document   : process
    Created on : Mar 19, 2022, 11:13:42 AM
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
               String Username = request.getParameter("txtUserName");
               String Password = request.getParameter("txtPassword");
                
        %>
        <table>
            <tbody>
                <tr>
                    <td>Your user name is</td>
                    <td><%=Username%></td>
                </tr>
                <tr>
                    <td>Your user name is</td>
                    <td><%=Password%></td>
                </tr>
            </tbody>
        </table>
         
    </body>
</html>
