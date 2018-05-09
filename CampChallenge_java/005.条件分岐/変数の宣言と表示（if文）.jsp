<%-- 
    Document   : 変数の宣言と表示（if文）
    Created on : 2018/05/09, 15:09:22
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
        <h1>変数の宣言と表示（if文）</h1>
        <%
        int num = 1;
        if(num == 1){
            out.print("1です！");
        }
        else if(num == 2){
            out.print("プログラミングキャンプです！");
        }
        else{
            out.print("その他です！");}
        
%>
    </body>
</html>
