/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.BlackJack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author guest1Day
 */
public class Dealer extends Human {
    
     ArrayList<Integer> Card=new ArrayList<>(); 
     
     Dealer(){
         for(int n = 0; n <= 4; n++){
         for (int i = 0; i <= 13; i++){
             if(i>10){
                 Card.add(10);
             }
             else{
                 Card.add(i);
             } 
                 
             }
         }
         this.myCards=new ArrayList<Integer>();
         
     }
     
     public ArrayList<Integer> deal(){
        ArrayList<Integer> resultcard = new ArrayList<Integer>();
        Random rand = new Random();
        
        for(int i = 0; i < 2; i++){
            Integer target = rand.nextInt(this.Card.size());
            resultcard.add(this.Card.get(target));
                           this.Card.remove(target);
        }
        return resultcard;
}
      public ArrayList<Integer> hit(){
        ArrayList<Integer> resultcard = new ArrayList<Integer>();
        Random rand = new Random();
        
            Integer target = rand.nextInt(this.Card.size());
            resultcard.add(this.Card.get(target));
                           this.Card.remove(target);
        
        return resultcard;
}

    @Override
    public int open() {
        int total=0;
        for(int i = 0; i < myCards.size(); i++){
            total = total + myCards.get(i);
        }
            return total;
        } 
    
    @Override
    public void setCard(ArrayList<Integer> set) {
        if(set!=null){
            for(int i = 0; i < set.size(); i++){
            this.myCards.add(set.get(i));
            }
        }
    }

    @Override
    public boolean checkSum() {
        if(open()<17){
            return true;
        }else{
            return false;
       }
    }
    
   
    
}