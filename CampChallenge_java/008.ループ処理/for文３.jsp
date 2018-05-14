<%-- 
    Document   : for文３
    Created on : 2018/05/14, 16:06:07
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
        <h1>for文３</h1>
        <%
        int num=0;
        for(int i=0;i<=100;i++){
        num=num+i;}
        out.print(num);
        %>
    </body>
</html>
