/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.File;

import java.io.*;

/**
 *
 * @author yuta
 */
public class File1 {
    public static void main(String[]args) throws IOException{
        //try{
        //ファイルオープン
        File fp = new File("test.txt");
        //FileWriter作成
        FileWriter fw = new FileWriter(fp);
        //書き込み
        fw.write("齋藤　7/7 蟹座");
        fw.close();
        //}catch(IOException e){
        //    e.printStackTrace();
        //}
      }
    }
    

