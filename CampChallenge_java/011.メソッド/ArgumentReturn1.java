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
public class ArgumentReturn1 extends HttpServlet {

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
    ユーザー定義メソッドを作成してください。引数・戻り値・処理内容については，以下の通りです。 

    ・引数 
      文字列型 
    ・戻り値 
      文字列型を要素に持つ配列型 
    ・処理内容 
      ３人分のプロフィール情報を，それぞれ配列で作成してください（プロフィール情報の項目は，課題「戻り値2」と同様です）。そして，引数として受け取った ID の値と同じ ID の値を持つ配列を，戻り値として返してください。 

    メソッドの呼び出し側の記述については，課題「戻り値2」と同様としてください。
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
            
            
            String[] b=list(1);  
           for(int i=1;i<=b.length;i++){
              out.print(b[i]);
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
