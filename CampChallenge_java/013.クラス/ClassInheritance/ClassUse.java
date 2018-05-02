/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.ClassInheritance;



/**
 *
 * @author guest1Day
 */
public class ClassUse {
    public static void main (String[]args){
        Dog dog = new Dog();
        dog.setdog("ポチ", 3);
        dog.print();
        
        
        PoliceDog police = new PoliceDog();
        police.setdog("太郎",5);
        police.print();
        
        police.clear();
        
        police.print();
    }
    
}
