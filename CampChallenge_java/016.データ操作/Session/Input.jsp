<%-- 
    Document   : Input
    Created on : 2018/05/17, 13:42:16
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            HttpSession hs = request.getSession();
            
            String name = (String)hs.getAttribute("name");
            String sex = (String)hs.getAttribute("sex");
            String hobby = (String)hs.getAttribute("hobby");
            
        %>
        <form action="Display.jsp" method="post">
        名前
        <input type="text" name="Name" value="<% 
            if(name != null){
                out.print(name);
            } %>">
        <br>
        男
        <input type="radio" name="Sex" value="男" <%
            if(sex != null){
                if(sex.equals("男")){
                    out.print("checked");
                }
            }
         %>>
        <br>       
        女
        <input type="radio" name="Sex" value="女" <%
            if(sex != null){
                if(sex.equals("女")){
                    out.print("checked");
                 }
            }
        %>>
        <br>
        趣味
        <textarea name="Hobby"><%
            if(hobby != null){
                out.print(hobby);
            }
        %></textarea>
        <br>
        <input type="submit" name="btnSubmit" value="決定">
        </form>
    </body>
</html>
