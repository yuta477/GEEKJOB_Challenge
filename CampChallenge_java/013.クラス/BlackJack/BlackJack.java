/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.BlackJack;

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
public class BlackJack extends HttpServlet {

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
            out.print("BlackJackを始めます<br>");
            
            //インスタンス化
            Dealer dealer = new Dealer();
            User user = new User();
            
            //手札に2枚加える
            dealer.setCard(dealer.deal());
            user.setCard(dealer.deal());
            
            out.print("最初のディーラーの手札:" + dealer.myCards + "合計値" + dealer.open() + "<br>");
            out.print("最初のユーザーの手札:" + user.myCards + "合計値" +user.open() + "<br>");
            
            //もう一枚引くかどうか
            //ディーラー
            while(dealer.checkSum() == true){
                dealer.setCard(dealer.hit());
            }
            //ユーザー
            while(user.checkSum() == true){
                user.setCard(dealer.hit());
            }
            
            out.print("最終的なディ－ラーの手札" + dealer.myCards + "合計値" + dealer.open() + "<br>");
            out.print("最終的なユーザーの手札" + user.myCards + "合計値" + user.open() + "<br>");
            
            if(user.open() >= 22 && dealer.open() >= 22){
                out.print("引き分け<br>");
            }else if(user.open() >= 22){
                out.print("ユーザーの負け<br>");
            }else if(dealer.open() >= 22){
                out.print("ユーザーの勝ち<br>");
            }else if(user.open() == dealer.open()){
                out.print("引き分け<br>");
            }else if(user.open() >= dealer.open()){
                out.print("ユーザーの勝ち<br>");
            }else if(user.open() <= dealer.open()){
                out.print("ユーザーの負け<br>");
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
