/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.LoginFunction;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author guest1Day
 */
public class LoginFunction extends HttpServlet {

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
    
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
         
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        String pass = request.getParameter("pass");
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geekjob_db","yuta","19920707");
           
            db_st = db_con.prepareStatement("select * from account where accountID = ? && password = ?");
            
            db_st.setString(1,id);
            db_st.setString(2,pass);
            boolean a = true;
            db_data = db_st.executeQuery();
            while(db_data.next()){
            a = false;
            HttpSession hs=request.getSession();
            hs.setAttribute("id",id);
            hs.setAttribute("pass",pass);
            
            out.print("ログインしました。<br>");
            out.print("<a href = \"http://localhost:8080/InventoryControl/AddStock/AddStock.jsp\">商品の追加</a><br>");
            out.print("<a href = \"http://localhost:8080/InventoryControl/InventoryList\">商品一覧</a><br>");
       }
            if(a==true){
                out.print("<a href = \"http://localhost:8080/InventoryControl/LoginFunction/LoginFunction.jsp\">ログインしてください。</a><br>");
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
