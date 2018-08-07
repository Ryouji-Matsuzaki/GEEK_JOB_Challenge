<%-- 
    Document   : for文２
    Created on : 2018/05/14, 16:01:38
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
        <h1>for文２</h1>
        <%
        String test="";
        
        for(int i=0;i<30;i++){
            test=test+"A";
        }
        out.print(test);
        %>
    </body>
</html>
