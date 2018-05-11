/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author yuta
 */
public class Date1 {
    public static void main(String[]args){
        
         Calendar c = Calendar.getInstance();
            c.set(2016,0,1,0,0,0);
                SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
                    System.out.print(sdf.format(c.getTime()));
/*
        Calendar c = Calendar.getInstance();
        c.set(2016,0,1,0,0,0);
        System.out.print(c.getTime());
*/
    }
    
}
