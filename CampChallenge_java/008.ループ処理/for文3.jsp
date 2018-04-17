<%-- 
    Document   : newjsp
    Created on : 2018/04/17, 11:12:49
    Author     : guest1Day
--%>
<% 
            long tasu =0;
            long tasu2 =0;
            for(int i =0 ; i <100 ; i++ ){
                tasu2 =++ tasu2;
            tasu = tasu + tasu2;
            
        }
            out.print(tasu);
           
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
