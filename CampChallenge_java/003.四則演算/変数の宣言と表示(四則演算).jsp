<%-- 
    Document   : newjsp
    Created on : 2018/04/10, 16:36:06
    Author     : guest1Day
--%>
<%
    final int BASE=100;
    int num=5;
    out.print(BASE+num);
    out.print("<br>");
    out.print(BASE-num);
    out.print("<br>");
    out.print(BASE*num);
    out.print("<br>");
    out.print(BASE/num);
    out.print("<br>");
    out.print(BASE%3);           
%>                    
            
        
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
