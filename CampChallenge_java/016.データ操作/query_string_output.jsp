<%-- 
    Document   : query_string_output
    Created on : 2018/06/20, 16:12:06
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエリストリング取得</title>
    </head>
    <body>
        <%
        request.setCharacterEncoding("UTF-8");
        out.println("TOTAL :"+request.getParameter("total")+" yen");
        out.println("COUNT :"+request.getParameter("count"));
        out.println("TYPE :"+request.getParameter("type"));
        
        int a=Integer.parseInt(request.getParameter("count"));
        int b=Integer.parseInt(request.getParameter("total"));
        out.print("Unit price :"+b/a);
        %>
        <%
        if(b>5000){
            out.println("POINT :"+b*0.05);
        }else if(b>3000){
            out.println("POINT :"+b*0.04);    
        }else if(b<3000){
            out.println("POINT :"+0);
        }
        
        %>
    </body>
</html>
