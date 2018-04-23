/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.Return;

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
public class Return1 extends HttpServlet {

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
  課題「ユーザー定義メソッドの作成」で作成したメソッドを改修します（ファイルは新規に作成してください）。引数・戻り値・処理内容については，以下の通りです。

 ・引数　PrintWriter型
 ・戻り値　boolean型
　このメソッドは，つねに true を返します。

  メソッドを作成したら，このメソッドを呼び出し，戻り値に応じて以下の条件判断を行ってください。
  true ... 「この処理は正しく実行できました」と画面に表示
  false ... 正しく実行できませんでした」と画面に表示
*/
    
    boolean myprofile(PrintWriter pw) {
            String a = ("齋藤 雄太<br>");
                   a = ("1992年7月7日<br>");
                   a = ("趣味はバスケです<br>");
                   return true;
}
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             for(int i=0;i<10;i++){
            if(myprofile(out)){
                out.print("この処理は正しく実行できました<br>");
            }else{
                out.print("正しく実行できませんでした<br>");
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
