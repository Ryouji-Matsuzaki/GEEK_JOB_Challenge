<%-- 
    Document   : query_string_input
    Created on : 2018/06/20, 15:44:51
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエリストリングの利用</title>
    </head>
    <body>
        <form action="./query_string_output.jsp" method="get">
            <p>total</p>
                <input type="text" name="total"><br>
            <p>count</p>
                <input type="text" name="count"><br>
            <p>type</p>
            １<input type="radio" name="type" value="雑貨">
            ２<input type="radio" name="type" value="生鮮">
            ３<input type="radio" name="type" value="その他">
            
            <input type="submit" name="btn">
        </form>
    </body>
</html>
