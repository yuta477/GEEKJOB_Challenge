/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class File3 {
    public static void main(String[] args) throws IOException{
   
    // 今日の日付作成
    Date now = new Date();
    // SimpleDateFormat作成
    SimpleDateFormat a =
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 開始");
             System.out.println(a.format(now));
   
    //乱数を生成し、整数に四捨五入する
    double dnum = Math.random()*10;
    dnum = Math.ceil(dnum);
    System.out.println(dnum);
    System.out.println("乱数を生成し、整数に四捨五入する");        
    
    // 今日の日付作成
    //Date now = new Date();
    // SimpleDateFormat作成
    SimpleDateFormat b =
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 終了");
             System.out.println(b.format(now));
    
     //ファイルオープン
    File fp = new File("log.txt");
    //FileWriter作成
    FileWriter fw = new FileWriter(fp);
    //書き込み
    fw.write(a.format(now)+"\n"+dnum+"\n"+"乱数を生成し、整数に四捨五入する\n"+b.format(now));
    fw.close();         
}
}
