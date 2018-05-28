/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.DeleteSpecificRecord;

import java.sql.*;

/**
 *
 * @author guest1Day
 */
public class DeleteSpecificRecord {
    public static void main (String[] args){
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geekjob_db","yuta","19920707");
            
            db_st = db_con.prepareStatement("DELETE FROM profiles WHERE profilesID = 3;");
            db_st.executeUpdate();
            
            db_st = db_con.prepareStatement("SELECT * FROM profiles;");
  
            db_data = db_st.executeQuery();
            while(db_data.next()){
            System.out.print("ID：" + db_data.getString("profilesID") + "<br>");
            System.out.print("名前：" + db_data.getString("name") + "<br>");
            System.out.print("電話："+db_data.getString("tel")+"<br>");
            System.out.print("誕生日：" + db_data.getString("birthday") + "<br>");
       }
            
            db_con.close();
            db_st.close();
            db_con.close();
            
        } catch (SQLException e_sql) {
            System.out.println("接続時にエラーが発生しました:"+e_sql.toString());
        } catch (Exception e) {
            System.out.println("接続時にエラーが発生しました:"+e.toString());
        } finally {
            if (db_con != null) {
                try {
                    db_con.close();
                } catch (Exception e_con) {
                    System.out.println(e_con.getMessage());
                }
            }
        }    
    }
}
    


    

