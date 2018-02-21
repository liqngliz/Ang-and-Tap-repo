package javaapplication6;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * @author Tapiwa Musasa && Ang Li
 *
 */

//The inventory is a singleton, only one inventory for many items kind of like a Log
public class AngTapsInventory implements Serializable {
    
    private static AngTapsInventory instance = null;
    
    protected AngTapsInventory() {
      // Exists only to defeat instantiation.
    }
    public static AngTapsInventory getInstance() {
      if(instance == null) {
         instance = new AngTapsInventory();
        }
        return instance;
    }
    
    public String lastmsg ="";
    
    //Using the generic abstract class we can "hold" any children items
    //irrespective of their implmentation class in our inventory or "bag"
    //essentially bags hold stuff, stuff is abstract and can be anything.
    public ArrayList<Products> productsList = new ArrayList<Products>();
    
    public int maxAmount = 10;
    
    //this is a setter for the inventory class
    public void addToInventory (Products theProduct){
        try {
            if (this.productsList.size() < maxAmount){
                this.productsList.add(theProduct);
                lastmsg = "Item added";
            } else {
               RuntimeException e =  new RuntimeException();
               lastmsg = "This inventory is full";
            }
        } catch (RuntimeException e) {
            //do nother as no item has been added
        }
    }
    
    //This is a getter for the inventory class
    public void removeFromInventory (Products aProduct){
        //look through inventory to remove a product with the same name and class
            //System.out.println(aProduct.getClass().toString());
        for(int n = 0; n < this.productsList.size(); n++){
            //System.out.println(this.productsList.get(n).getClass().toString());
            if(this.productsList.get(n).getClass().equals(aProduct.getClass())){
               this.productsList.remove(n);
               //we only want to remove 1 per call, First in first out type remove
               return;
            }
        }
        
    } 

}