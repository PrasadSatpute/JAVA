<%-- 
    Document   : student
    Created on : Mar 19, 2022, 1:47:45 PM
    Author     : AVENGER'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="mystyle.css">
    </head>
    <body>
        <%@include file="Header.jsp" %>
        <h4 style="align-content: center; align-items: center">${param.message}</h4>
        <form action="register">
            <table cellspacing="1" align="center">
                <thead>
                    <tr>
                        <th colspan="2"><h2>Student Entery</h2></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="fname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Branch</td>
                        <td><select name="branch">
                                <option>IT</option>
                                <option>CSE</option>
                                <option>ETC</option>
                                <option>MECH</option>
                                <option>CIVIL</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Year</td>
                        <td><select name="year">
                                <option>1st Year</option>
                                <option>2nd Year</option>
                                <option>3rd Year</option>
                                <option>4th Year</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><textarea name="address" rows="4" cols="20">
                            </textarea></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>Contact</td>
                        <td><input type="text" name="contact" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Register" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
