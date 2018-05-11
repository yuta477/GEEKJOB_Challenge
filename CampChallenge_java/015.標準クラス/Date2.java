/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.Date;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author guest1Day
 */
public class Date2 {
    public static void main(String[] args) {
        
        // 今日の日付作成
        Date now = new Date();
        // SimpleDateFormat作成
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                 System.out.print(sdf.format(now));
    }
}

    

