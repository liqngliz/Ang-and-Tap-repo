package javaapplication6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angli and tapiwa
 */
public class groceriesCategory extends Products {
	

    public groceriesCategory(double myPrice, String myName, String mySummary, int myID) {
        super(myPrice, myName, mySummary, myID);
    }
    /*
    @Override public void summarizeSelf() {
        //I am fruits an vegetables, I perish over time from your inventory
        
    }*/

    @Override void addToInventory(AngTapsInventory inv) {
            // TODO Auto-generated method stub
            inv.addToInventory(groceriesCategory.this);
            
            //Oh no some food preished when too many items are stored in the bag!
            if(inv.productsList.size()>5){
             inv.removeFromInventory(groceriesCategory.this);
             inv.removeFromInventory(groceriesCategory.this);
            }
	}

    @Override void removeFromInventory(AngTapsInventory inv) {
		// TODO Auto-generated method stub
		inv.removeFromInventory(groceriesCategory.this);

	}

}
