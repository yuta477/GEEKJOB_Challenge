<%-- 
    Document   : newjsp
    Created on : 2018/04/16, 15:41:16
    Author     : guest1Day
--%>

<%@ page import="java.util.ArrayList" %>
<%
ArrayList<String> data = new ArrayList<String>();
data.add("1");
data.add("100");
data.add("soeda");
data.add("hayashi");
data.add("-20");
data.add("118");
data.add("END");
data.set(2, "33");
out.print(data.get(0));
out.print("<br>");
out.print(data.get(1));
out.print("<br>");
out.print(data.get(2));
out.print("<br>");
out.print(data.get(3));
out.print("<br>");
out.print(data.get(4));
out.print("<br>");
out.print(data.get(5));
out.print("<br>");
out.print(data.get(6));
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
