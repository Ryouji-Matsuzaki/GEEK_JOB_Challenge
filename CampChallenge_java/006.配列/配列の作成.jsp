<%-- 
    Document   : 配列の作成
    Created on : 2018/05/14, 11:44:13
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
        
        <h1>配列の作成</h1>
        <%@page import="java.util.ArrayList"%>
        <%
        ArrayList<String> data = new ArrayList<String>();
        data.add("10");
        data.add("100");
        data.add("soeda");
        data.add("hayashi");
        data.add("-20");
        data.add("118");
        data.add("END");
        
        out.print(data);
        
        
        
        %>
        
       
    </body>
</html>
