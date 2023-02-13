<%-- 
    Document   : home.jsp
    Created on : 12-Feb-2023, 8:22:19 PM
    Author     : Rahul Bisht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h3>Hello ${sessionusername.username}</h3>
        <a href="login?logout">Log out</a>
    </body>
</html>