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
	private static final int MaxStock = 3; 
	private String[] stockMAX; // course codes 
    
    public groceriesCategory(double myPrice, String myName, String mySummary, int myID, int myQty) {
        super(myPrice, myName, mySummary, myID, myQty);
    }
    
    //make some fruits and vegetables disappear over time
    @Override public boolean removeFromInventory(String stockLevels) {
        int myQty = 0;
        stockMAX = new String[MaxStock];
       boolean match = false;
       // Inventory index lookup by first initializing the index
       int stockIndex = -1;  
       for (int num = 0; num < myQty; num++) {
          if (stockMAX[num].equals(stockLevels)) {
        	  stockIndex = num;
             match = true;
             break;
          }
       }
       if (match) {
          // truncate the inventory and do array rearrange
          for (int num = stockIndex; num < myQty-1; num++) {
        	  stockMAX[num] = stockMAX[num+1];
          }
          myQty--;
          return true;
       } else {
          return false;
       }
    }
    
    // Returns false if the inventory is not found
    @Override public boolean addToInventory(String stockLevels) {
    	// Initialize quantity to 0
    	int myQty = 0;
    	stockMAX = new String[MaxStock];
		// Checks to see if inventory already captured
    	 for (int num = 0; num < myQty; num++) {
    	       if (stockMAX[num].equals(stockLevels)) 
    	    	   return false;
    	     }
    	      stockMAX[myQty] = stockLevels;
    	      myQty++;
    	      return true;
    }
    
    @Override public void summarizeSelf() {
        //I am fruits an vegetables, I perish over time from your inventory
    }

	@Override
	void addToInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void removeFromInventory() {
		// TODO Auto-generated method stub
		
	}

}
