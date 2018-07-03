<%-- 
    Document   : input_field_s
    Created on : 2018/07/03, 13:31:50
    Author     : amoro_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <%
            HttpSession c=request.getSession();
            String name= (String)c.getAttribute("name");
            String hobby=(String)c.getAttribute("hobby");
            String gender=(String)c.getAttribute("gender");
        %>
    <body>
        <h1>Sample form</h1>
            <form action="inputfield" method="post">
                <p>name</p>
                <input type="text"name="txtName" value="<%if(name!=null){out.print(name);}%>"/>
                <p>gender</p>
                man<input type="radio" name="rdoSample" value="man"<%if(gender!=null && gender.equals("man")){out.print("checked");}%>/>
                woman<input type="radio" name="rdoSample" value="woman"<%if(gender!=null && gender.equals("woman")){out.print("checked");}%>/><br>
                <p>hobby</p>
                <input type="text" name="mulText" value="<%if(hobby!=null){out.print(hobby);}%>"/>
            
                <input type="submit" name="btnSubmit">
            </form>
    </body>
</html>
