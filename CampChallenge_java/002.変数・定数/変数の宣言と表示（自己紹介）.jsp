<%-- 
    Document   : 変数の宣言と表示（自己紹介）
    Created on : 2018/05/09, 11:09:25
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
        <h1>変数の宣言と表示</h1>
          <%
        {
            String text = "私の名前は松崎亮士です。";
            out.print(text);
        }
    %>
    </body>
</html>
