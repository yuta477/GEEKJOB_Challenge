<%-- 
    Document   : PrimeFactorization
    Created on : 2018/05/14, 14:40:02
    Author     : guest1Day
--%>

<%@page import="java.util.ArrayList"%>
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
    
        int total  = Integer.parseInt (request.getParameter("number"));
        int x = total;
      
        out.println(x+"=");
        
        ArrayList<String> data = new ArrayList<String>();


        for (int i = 2; i < 10; i++) {
            while ((x % i) == 0) {
        
                String s = String.valueOf(i);
                data.add(s);
                x = x / i;
            }            
        }
                out.print(String.join("*", data));
                out.print("あまり"+x);
 %>
    </body>
</html>
