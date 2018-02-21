/**
 * 
 */
package javaapplication6;
/**
 * @author Tapiwa Musasa and Ang Li
 *
 */

public abstract class Products {
	//We assume a constant single price pr product, 
        //instead of varying prices which would use a Dictionary<datetime,double>
    
	private double price;
        
        //Stock ID is same for all of the same type of stock
        //Stock Qty is the amount that is in this product batch to be added/removed from the inventory
        
	private int stockID;
	private String stockName, stockSummary;
        
	//Availability handled by inventory class when total stock amount reaches 0
        //private boolean stockAvailability;
	
	//constructor
	
	public Products(double price, String StockName, String stockSummary, int stockID) {
		   this.price = price;
		   this.stockID = stockID;
		   this.stockName = StockName;
		   this.stockSummary = stockSummary;
		   
        }   
        
	// Getters and Setters
        public double getPrice(){
             return this.price;
        }
        
        public void setPrice(double setMyPrice){
            this.price = setMyPrice;
        } 
        
        public int getStockID(){
            return this.stockID;
        }
        
        public void setStockID(int myStockID){
            this.stockID = myStockID;
        }
        
        public String getStockName(){
            return this.stockName;
        }
        
        public void setStockName(String myStockName){
            this.stockName = myStockName;
        }
        
        public String getStockSummary(){
            return this.stockSummary;
        }
        
        public void setStockSummary(String myStockSummary){
            this.stockSummary = myStockSummary;
        }
        
        
        //abstract methods: describe self, add to the inventory, remove from the inventory
        //abstract void summarizeSelf();
        abstract void addToInventory(AngTapsInventory inv);
        abstract void removeFromInventory(AngTapsInventory inv);

        /**
	public boolean removeFromInventory(String stockLevels) {
			// TODO Auto-generated method stub
			return false;
		}

	public boolean addToInventory(String stockLevels) {
			// TODO Auto-generated method stub
			return false;
		}
        **/

}