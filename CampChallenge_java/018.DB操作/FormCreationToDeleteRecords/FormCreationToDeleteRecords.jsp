<%-- 
    Document   : FormCreationToDeleteRecords
    Created on : 2018/05/28, 16:18:36
    Author     : guest1Day
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        request.setCharacterEncoding("UTF-8");
        int profilesID = Integer.parseInt(request.getParameter("profilesID"));
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geekjob_db","yuta","19920707");
           
            db_st = db_con.prepareStatement("DELETE FROM profiles WHERE profilesID = ?" );
            db_st.setInt(1,profilesID);
            db_st.executeUpdate();
            
            db_st = db_con.prepareStatement("SELECT * FROM profiles");
            
            db_data = db_st.executeQuery();
            while(db_data.next()){
            out.print("ID：" + db_data.getString("profilesID") + "<br>");
            out.print("名前：" + db_data.getString("name") + "<br>");
            out.print("電話："+db_data.getString("tel")+"<br>");
            out.print("誕生日：" + db_data.getString("birthday") + "<br>");
       }
            
            db_con.close();
            db_st.close();
            db_data.close();
            
        } catch (SQLException e_sql) {
            out.println("接続時にエラーが発生しました:"+e_sql.toString());
        } catch (Exception e) {
            out.println("接続時にエラーが発生しました:"+e.toString());
        } finally {
            if (db_con != null) {
                try {
                    db_con.close();
                } catch (Exception e_con) {
                    out.println(e_con.getMessage());
                }
            }
        }    
%>
    </body>
</html>
