<%-- 
    Document   : AddStock
    Created on : 2018/06/08, 10:57:57
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
        HttpSession hs = request.getSession();
        String id = (String)hs.getAttribute("id");
        String pass = (String)hs.getAttribute("pass");
        
        if(id==null){
            out.print("<a href = \"http://localhost:8080/InventoryControl/LoginFunction/LoginFunction.jsp\">ログインしてください。</a><br>");
        }
        else{%>
         <div>在庫追加</div>
         <form action="/InventoryControl/AddStock" method="post">   
         <div>ID</div>
         <input type="text" name="id">
         <br>
         <div>品物</div>
         <input type="text" name="item">
         <br>
         <div>数量</div>
         <input type="text" name="quantity">
         <br>
         <div>価格</div>
         <input type="text" name="price">
         <br>
         <input type="submit" name="btnSubmit" value="決定">
         <br>
        </form>
    </body>
    <%}%>
</html>
