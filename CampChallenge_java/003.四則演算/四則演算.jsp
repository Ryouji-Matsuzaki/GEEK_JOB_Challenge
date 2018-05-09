<%-- 
    Document   : 四則演算
    Created on : 2018/05/09, 13:53:32
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
        <h1>四則演算</h1>
        <%
        int x =5;
        final int y =10;
        
            int tasu = x+y;
        
            int hiku = x-y;
        
            int kake = x*y;
        
            int waru = x/y;  
        out.print(tasu);
        
        out.print(hiku+"br");
        
        out.print(kake+"br");
        
        out.print(waru+"br");
   
        %>
    </body>
</html>
