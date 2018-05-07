/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.BlackJack;

import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author guest1Day
 */

//抽象クラス
public abstract class Human {
    //合計値計算
    public abstract int open();
    //自分の手札としてセット
    public abstract void setCard(ArrayList<Integer>set);
    //自分の手札と21を比べて判定
    public abstract boolean checkSum();
    //自分の手札管理
    ArrayList<Integer> myCards=new ArrayList<>(); 
    //public List<String> myCards;
}

