<%-- 
    Document   : switch文１
    Created on : 2018/05/09, 16:05:20
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
        <h1>switch文１</h1>
        <%
           int type=3;
           
            switch(type){
                case 1:
                    out.print("one");
                    break;
                case 2:
                    out.print("two");
                    break;
                default:
                   out.print("想定外");
                   break;
                        
            }
        %>
    </body>
</html>
