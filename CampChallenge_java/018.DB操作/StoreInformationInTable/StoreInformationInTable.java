/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.StoreInformationInTable;

import java.sql.*;

/**
 *
 * @author guest1Day
 */
public class StoreInformationInTable {
    public static void main(String[] args){
     Connection db_con = null;
     PreparedStatement db_st = null;
     ResultSet db_data = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geekjob_db","yuta","19920707");
            
            db_st = db_con.prepareStatement ("INSERT INTO profiles(profilesID,name,tel,age,birthday)VALUES(3,'田中 太郎','0120-7777-7777',20,'2000-7-7')");
            
            db_st.executeUpdate();
            
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