/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.AddStock;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author guest1Day
 */
public class InventoryList extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        
        request.setCharacterEncoding("UTF-8");
        HttpSession hs = request.getSession();
        String id = (String)hs.getAttribute("id");
        String pass = (String)hs.getAttribute("pass");
          
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
   
        try
        {
            if(id==null){
            out.print("<a href = \"http://localhost:8080/InventoryControl/LoginFunction/LoginFunction.jsp\">ログインしてください。</a><br>");
            }else{  
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geekjob_db","yuta","19920707");    
            db_st = db_con.prepareStatement("SELECT * FROM stock");
            db_data = db_st.executeQuery();
            while(db_data.next()){
            out.print("ID：" + db_data.getString("ID") + "<br>");
            out.print("品物：" + db_data.getString("item") + "<br>");
            out.print("数量："+db_data.getString("quantity")+"<br>");
            out.print("価格："+db_data.getString("price")+"<br>");
            }
            db_con.close();
            db_st.close();
            db_data.close();
        }     
            
            
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
    }
}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
