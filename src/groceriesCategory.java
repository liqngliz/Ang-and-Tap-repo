package javaapplication6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angli
 */
public class groceriesCategory extends Products {
    
    public groceriesCategory(double myPrice, String myName, String mySummary, int myID, int myQty) {
        super(myPrice, myName, mySummary, myID, myQty);
    }
    
    //make some fruits and vegetables dissapear over time
    @Override public void removeFromInventory(){
    }
    
    @Override public void addToInventory(){
    }
    
    @Override public void summarizeSelf(){
        //I am fruits an vegetables, I perish over time from your inventory
    }
}
