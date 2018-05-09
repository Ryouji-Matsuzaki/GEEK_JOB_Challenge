<%-- 
    Document   : switch文２
    Created on : 2018/05/09, 16:15:57
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
        <h1>switch文２</h1>
        <%
           char x='A';
           
            switch(x){
                case 'A':
                    out.print("英語");
                    break;
                case 'あ':
                    out.print("日本語");
                    break;
                default:
                   break;
                        
            }
        %>
    </body>
</html>
