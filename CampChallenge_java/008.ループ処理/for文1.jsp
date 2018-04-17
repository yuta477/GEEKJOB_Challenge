<%-- 
    Document   : newjsp
    Created on : 2018/04/17, 10:13:04
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
        <h1></h1>
    </body>
</html>


<%
    long total=1;
    for(int i=1;i<=20;i++){
        total=total*8;   
    }
     out.print(total);
%>