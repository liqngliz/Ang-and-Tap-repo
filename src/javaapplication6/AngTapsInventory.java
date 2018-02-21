package javaapplication6;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Box;


/**
 * @author Tapiwa Musasa && Ang Li
 *
 */
public class AngTapsInventory {

	/**
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * 
	 */
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO code application logic here	
    	 // create custom input fields
    	JTextField nameInput = new JTextField(10);
        JTextField priceInput = new JTextField(4);
        JTextField descInput = new JTextField(15);
        
        //new panels and text fields
        JPanel stockGUI = new JPanel();
        //stock name input field
        stockGUI.add(new JLabel("Name:"));
        stockGUI.add(nameInput);
        // add extra space between input fields
        stockGUI.add(Box.createHorizontalStrut(3));
        //stock price input field and label
        stockGUI.add(new JLabel("Price:"));
        stockGUI.add(priceInput);
        // add extra space between input fields
        stockGUI.add(Box.createHorizontalStrut(3));
        //stock description input field and label
        stockGUI.add(new JLabel("Description:"));
        stockGUI.add(descInput);


        int invPane = JOptionPane.showConfirmDialog(null, stockGUI,"Grocery inventory", JOptionPane.OK_CANCEL_OPTION);
        if(invPane == JOptionPane.OK_OPTION) {
            String inputPrice = priceInput.getText();
            int conPrice = Integer.parseInt(inputPrice);
            groceriesCategory prods = new groceriesCategory(conPrice,descInput.getText(),nameInput.getText(),0,0);
    		prods.getPrice();
    		prods.getStockSummary();
    		prods.getStockName();
    	  System.out.println("This products are grocery categories ");
    	  System.out.println("Name: " + prods.getStockName());
          System.out.println("Price of: "  + prods.getPrice());
          System.out.println("Summary: " + prods.getStockSummary());
        }
	}

}