<%-- 
    Document   : 連想配列の作成
    Created on : 2018/05/14, 13:17:10
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
        <h1>連想配列の作成</h1>
        <%@page import="java.util.*"%>        
        <%
        HashMap<String,String> data =new HashMap<String,String>();
        data.put("1","hello");
        data.put("hello","world");
        data.put("soeda","33");
        data.put("20","20");
        out.print(data);
        %>
    </body>
</html>
