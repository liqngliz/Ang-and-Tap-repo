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
public class hardwareCategory extends Products {
     public hardwareCategory(double myPrice, String myName, String mySummary, int myID) {
         super(myPrice, myName, mySummary, myID);
     }
     
    //Normal add or remove
    @Override public void removeFromInventory(AngTapsInventory inv){
        inv.removeFromInventory(hardwareCategory.this);
    }
    
    @Override public void addToInventory(AngTapsInventory inv){
        inv.addToInventory(hardwareCategory.this);
    }
    
    /*
    @Override public void summarizeSelf(){
        //summarizes total amount stolen over last 10 seconds
    }*/
}
