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
public class NonMetalElement extends Element{

    public NonMetalElement(String symbol, Integer number, Integer weight) {
        super(symbol, number, weight);
    }
    
    

    @Override
    public void describeElement() {
        System.out.println("Symbol:"+this.symbol+" Número Atómico:"+this.number+" Peso:"+this.weight);
    }
    
}
