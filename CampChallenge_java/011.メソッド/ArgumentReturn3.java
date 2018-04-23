/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.ArgumentReturn;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class ArgumentReturn3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    /*
    課題「引数，戻り値２」を改修します。
    整数型の変数 limit を値 2 で用意してください。そして，limit を利用して，表示するプロフィール情報を２名分のみにしてください。
    */
    
     String[] list(int id){
        String[] namber1 ={
            "1","佐藤","1/1","東京"
        }; 
        
        String[] namber2 ={
            "2","山田","2/2","千葉"
        };
        
        String[] namber3 ={
            "3","鈴木","3/3","神奈川"
        };
        
        if(id==1){
            return namber1;
        }
        else if(id==2){
            return namber2;
        }
        else if(id==3){
            return namber3;
        }    
            return null;
        }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
             Integer limit=2;
             for (int n=1;n<=3;n++){
                     String[] b=list(n);
                for(int i=1; i<b.length;i++){
               
                 if(b[i]==null){
                     continue;
                 }
                 
                 out.print(b[i]);
                 }
             if(n==limit){
                 break;
             }
             out.print("<br>");
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
