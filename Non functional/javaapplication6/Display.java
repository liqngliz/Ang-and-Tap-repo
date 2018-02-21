/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 *
 * @author angli
 */
public class Display {
    //Jframe print our summary of items
        JFrame frame;
        JPanel panel;
        JLabel view;
        JButton add1;
        JButton remove1;
        JButton add2;
        JButton remove2;
        JButton Save;
        
        String msg = "";
        
        public Display(AngTapsInventory I, groceriesCategory G, hardwareCategory H){
            gui(I,G,H);
        }
        
        public void gui(AngTapsInventory I, groceriesCategory G, hardwareCategory H){
            frame = new JFrame("Iventory view");
            frame.setVisible(true);
            frame.setSize(800,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            panel = new JPanel();
            panel.setBackground (Color.GRAY);
            
            //Get the names of all inventory items to display
            for(int n = 0; n < I.productsList.size(); n++){
                msg = msg + I.productsList.get(n).getStockName() + " ";
            }
            //The inventory will be displayed here
            view = new JLabel (msg);
            //Add and remove
            add1 = new JButton ("+ Hammer");
            add2 = new JButton ("+ Carrot");
            
            remove1 = new JButton ("- Hammer");
            remove2 = new JButton ("- Carrot");
            //Save the info
            Save =new JButton ("Save Inventory");
            
            add1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    H.addToInventory(I);
                    msg = "";
                    for(int n = 0; n < I.productsList.size(); n++){
                        msg = msg + I.productsList.get(n).getStockName() + " ";
                    }
                    panel.remove(view);
                    view = new JLabel (msg);
                    panel.add(view);
                    frame.revalidate();
                    frame.repaint();
                }
            });
            
            add2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    G.addToInventory(I);
                    msg = "";
                    for(int n = 0; n < I.productsList.size(); n++){
                        msg = msg + I.productsList.get(n).getStockName() + " ";
                    }
                    panel.remove(view);
                    view = new JLabel (msg);
                    panel.add(view);
                    frame.revalidate();
                    frame.repaint();
                }
            });
            
            remove1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    H.removeFromInventory(I);
                    msg = "";
                    for(int n = 0; n < I.productsList.size(); n++){
                        msg = msg + I.productsList.get(n).getStockName() + " ";
                    }
                    panel.remove(view);
                    view = new JLabel (msg);
                    panel.add(view);
                    frame.revalidate();
                    frame.repaint();
                }
            });
            
            remove2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    G.removeFromInventory(I);
                    msg = "";
                    for(int n = 0; n < I.productsList.size(); n++){
                        msg = msg + I.productsList.get(n).getStockName() + " ";
                    }
                    panel.remove(view);
                    view = new JLabel (msg);
                    panel.add(view);
                    frame.revalidate();
                    frame.repaint();
                } 
            });
            
            Save.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Inventory.txt"));
                        //Saves the whole inventory class
                        out.writeObject(I);
                    
                    } catch(Exception except){
                        System.out.println("Failed to save");
                    }
                } 
            });
            
            
      
            
            
            //Add all GUI elements to GUI frame
            panel.add(add1);
            panel.add(add2);
            panel.add(remove1);
            panel.add(remove2);
            panel.add(Save);
            panel.add(view);
            frame.add(panel);
            
           
        }
        
        
}
