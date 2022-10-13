<%-- 
    Document   : userInterface
    Created on : Mar 19, 2022, 11:36:38 AM
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
        <form action="processOutput.jsp">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="2">User Information</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="txtUserName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="txtPassword" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="email" name="txtEmail" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="Submit" name="Submit" />
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
