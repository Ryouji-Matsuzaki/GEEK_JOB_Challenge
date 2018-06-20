<%-- 
    Document   : test
    Created on : 2018/06/19, 17:16:52
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
        <%
        request.setCharacterEncoding("UTF-8");
        
        out.println(request.getParameter("txtName"));
        out.println(request.getParameter("rdoSample"));
        out.println(request.getParameter("mulText"));
        
        
        %>
    </body>
</html>
