<%-- 
    Document   : for文１
    Created on : 2018/05/14, 14:19:27
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>for文1</h1>
        <%
        long num =8;
        for(int i = 0;i<20;i++){
           num=num*8;}
        out.print(num);
        %>
    </body>
</html>
