/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author angli
 */
public abstract class hardwareCategory extends Products {
     public hardwareCategory(double myPrice, String myName, String mySummary, int myID, int myQty) {
         super(myPrice, myName, mySummary, myID, myQty);
     }
     
    //Very valuable can be stolen 10% chance every second
    @Override public void removeFromInventory(){
    }
    
    @Override public void addToInventory(){
    }
    
    @Override public void summarizeSelf(){
        //summarizes total amount stolen over last 10 seconds
    }
}
