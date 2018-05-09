<%-- 
    Document   : 文字の連結表示
    Created on : 2018/05/09, 14:48:59
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
        <h1>文字の連結表示</h1>
        <%
        String a= "groove";
        String b="-";
        String c="gear";
        
        out.print(a+b+c);

        %>
        
    </body>
</html>
