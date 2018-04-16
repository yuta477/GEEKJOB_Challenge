<%-- 
    Document   : newjsp
    Created on : 2018/04/16, 13:43:26
    Author     : guest1Day
--%>
<%
    int type='A';
    switch(type) {
    case 'A':
    out.print("英語");
    break;
    case 'あ':
    out.print("日本語");
    break;
    }
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
