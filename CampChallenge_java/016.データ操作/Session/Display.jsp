<%-- 
    Document   : Display
    Created on : 2018/05/17, 13:35:01
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
        
        String name = request.getParameter("Name");
        String sex = request.getParameter("Sex");
        String hobby = request.getParameter("Hobby");

        HttpSession hs=request.getSession();

        hs.setAttribute("name",name);
        hs.setAttribute("sex",sex);
        hs.setAttribute("hobby",hobby);
        
        out.print("送信されました");
        %>
    </body>
</html>
