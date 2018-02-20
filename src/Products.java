/**
 * 
 */

/**
 * @author Tapiwa Musasa and Ang Li
 *
 */

public class Products {
	//variable instance
	private double price;
	private int stockID, stockQty;
	private String stockName, stockSummary;
	private boolean stockAvailability;
	
	//constructor
	
	public Products(double price, String StockName, String stockSummary, int stockID, int stockQty, boolean stockAvailability, String stockName) {
		   this.price = price;
		   this.stockID = stockID;
		   this.stockAvailability = stockAvailability;
		   this.stockName = stockName;
		   this.stockSummary = stockSummary;
		   this.stockQty = stockQty;
    }
	
	// Getters and Setters

}
