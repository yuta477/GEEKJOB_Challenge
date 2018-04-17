<%-- 
    Document   : newjsp
    Created on : 2018/04/16, 16:34:30
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

<%@ page import="java.util.*" %>
<%
    HashMap<String, String> x =
                new HashMap<String, String>();
    x.put("1", "AAA");
    x.put("hello", "world"); 
    x.put("soeda", "33");
    x.put("20", "20");
    
//↑ここまでが課題    
   
    out.print(x.get("1"));  
    out.print("<br>");
    out.print(x.get("hello"));
    out.print("<br>");
    
    out.print("1"+x.get("1"));
    out.print("<br>");
    
    ArrayList<HashMap> data = new ArrayList<HashMap>();
    data.add(x);
    out.print(data.get(0));
    
   
   
%>


