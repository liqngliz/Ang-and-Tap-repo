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
public class JavaApplication6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instiantiate a single inventory, singleton ensures we only
        // have 1 unique inventory
        AngTapsInventory singleInv = new AngTapsInventory();
        
        //instantiate the hammer from hardware
        double hammerPrice = 12.2;
        String hammerName = "Hammer";
        String hammerSummary = "I am hammer";
        int myhammerID = 2;
        
        hardwareCategory hammer = new hardwareCategory(hammerPrice, hammerName, hammerSummary, myhammerID);
        
        //instantiate the carrot from gorceries
        double carrotPrice = 2;
        String carrotName = "Carrot";
        String carrotSummary = "Carrot perishable";
        int mycarrotID = 1;
        
        groceriesCategory carrot = new groceriesCategory(carrotPrice, carrotName, carrotSummary, mycarrotID);
        
        //add hammer or carrot to Inventory (test) different implementations of add
        //after 5 items carrots start perishing if we keep trying to add
        hammer.addToInventory(singleInv);
        carrot.addToInventory(singleInv);
        carrot.addToInventory(singleInv);
        carrot.addToInventory(singleInv);
        carrot.addToInventory(singleInv);
        carrot.addToInventory(singleInv);
        carrot.addToInventory(singleInv);
        carrot.addToInventory(singleInv);
        hammer.addToInventory(singleInv);
        
        //Test without GUI
        System.out.println(singleInv.productsList.get(0).getClass());
        System.out.println(singleInv.productsList.get(1).getClass());
        System.out.println(singleInv.productsList.get(2).getClass());
        System.out.println(singleInv.productsList.get(3).getClass());
        
        
        

        //System.out.println(singleInv.productsList.get(4).getClass());
        //System.out.println(singleInv.productsList.get(5).getClass());
        //System.out.println(singleInv.productsList.get().getClass());
        new Display(singleInv, carrot, hammer);
        
        
        
        
    }
    
}
