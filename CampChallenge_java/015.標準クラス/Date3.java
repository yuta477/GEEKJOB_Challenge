/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author guest1Day
 */
public class Date3 {
    public static void main(String[] args) {
        // カレンダーインスタンスの作成
        Calendar c = Calendar.getInstance();
        // 2016年11月4日 10時0分0秒
        c.set(2016, 10, 4, 10, 0, 0);
        SimpleDateFormat a =
            new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
                System.out.print(a.format(c.getTime())+"<br>");
        
         SimpleDateFormat b =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.print(b.format(c.getTime()));
    }
    
}
