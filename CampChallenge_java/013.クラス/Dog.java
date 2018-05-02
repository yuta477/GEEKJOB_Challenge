/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.ClassUse;

import java.io.PrintWriter;

/**
 *
 * @author guest1Day
 */
public class Dog {
     
        public String name = "";
        public int age = 0;
        
       //メソッドの宣言
        public void setdog(String n,int a){
            //引数をフィールドへ設定
            this.name = n;
            this.age = a;
        }
        
        /*
        public void print(PrintWriter pw){
            pw.print(name);
            pw.print(age);
            }
        */
        
        
        public void print(){
            String print = "名前は" + this.name + "<br>年齢は" + this. age;
            System.out.print(print);
            }
        
    
}
