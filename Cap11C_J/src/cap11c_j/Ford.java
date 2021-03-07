/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11c_j;

/**
 *
 * @author ALEW
 */
public class Ford extends Auto{

    public Ford(){
        this.make = "Ford";
        setPrice();
    }
    
    @Override
    public void setPrice() {
       this.price = 22000;
    }
    
}
