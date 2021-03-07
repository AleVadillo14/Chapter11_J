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
public abstract class Element {
    protected String symbol;
    protected Integer number;
    protected Integer weight;

    public Element(String symbol, Integer number, Integer weight) {
        this.symbol = symbol;
        this.number = number;
        this.weight = weight;
    }
    
    public abstract void describeElement();
    
}
