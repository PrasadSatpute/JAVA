<%-- 
    Document   : index
    Created on : Mar 19, 2022, 11:10:24 AM
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
        <form action="process.jsp">
            <table border="1" cellpadding="10" align="Center">
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="txtUserName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="txtPassword" value="" /></td>
                    </tr>
                    <tr>
                        <td>submit</td>
                        <td><input type="submit" value="Submit" /></td>
                    </tr>
                </tbody>
            </table>
        </form>
            
    </body>

</html>
