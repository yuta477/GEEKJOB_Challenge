<%-- 
    Document   : displayjsp
    Created on : 2018/05/11, 14:49:26
    Author     : guest1Day
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
            out.println("名前：" + request.getParameter("Name") + "<br>");
            out.print("性別：" + request.getParameter("Sex") + "<br>");
            out.print("趣味：" + request.getParameter("Hobby") + "<br>");
        %>
    </body>
</html>
