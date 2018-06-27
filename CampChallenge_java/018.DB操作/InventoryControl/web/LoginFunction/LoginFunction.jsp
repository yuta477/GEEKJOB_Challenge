<%-- 
    Document   : LoginFunction
    Created on : 2018/06/08, 11:08:04
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
         <div>ログインして下さい</div>
         <form action="/InventoryControl/LoginFunction" method="post">   
         <div>ID</div>
         <input type="text" name="id">
         <br>
         <div>パスワード</div>
         <input type="text" name="pass">
         <br>
         <input type="submit" name="btnSubmit" value="決定">
         <br>
         </form>
    </body>
</html>
