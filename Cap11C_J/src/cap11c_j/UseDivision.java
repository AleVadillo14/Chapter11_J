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
public class UseDivision {
    public static void useDivision(){
        InternationalDivision inter= new InternationalDivision("Mexico","Spanish","Gerardo",313113);
        DomesticDivision domest = new DomesticDivision("Oaxaca","Gerardo",45355);
        inter.display();
        domest.display();
    }
}
