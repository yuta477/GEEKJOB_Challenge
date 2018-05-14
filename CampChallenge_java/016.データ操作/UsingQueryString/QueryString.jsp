<%-- 
    Document   : UsingQueryString
    Created on : 2018/05/14, 10:51:07
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
            out.println("総額：" + request.getParameter("total") +("円")+"<br>");
            out.println("個数：" + request.getParameter("count") +("個")+"<br>");
            out.print("商品：" + request.getParameter("type") + "<br>");
            
            int total  = Integer.parseInt (request.getParameter("total"));
            out.print("ポイント:");
       if(total<3000){
           out.print(0);
       }else if(total<5000){
           out.print(total*0.04);
       }else if(total>5000){
           out.print(total*0.05);
       }
       
    %>
    </body>
</html>
