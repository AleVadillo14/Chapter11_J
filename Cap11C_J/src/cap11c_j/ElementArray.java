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
public class ElementArray {
    public static void elementArray(){
        MetalElement metalElement = new MetalElement("Ag",12,12);
        NonMetalElement nonMetalElement = new NonMetalElement("O",16,2);
        metalElement.describeElement();
        nonMetalElement.describeElement();
    }
}
