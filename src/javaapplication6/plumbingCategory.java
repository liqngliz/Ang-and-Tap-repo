/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author angli and tapiwa
 */
public interface plumbingCategory  {
    public void Display();
}
 interface electricalsCategory  {
    public void Sale(); 
}
 
abstract class KitchenProducts implements plumbingCategory, electricalsCategory {
	 
 }