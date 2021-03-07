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
public class UseGeometric {
    public static void useGeometric(){
        Square square = new Square(12);
        Triangule triangule = new Triangule(5,2);
        
        System.out.println(square.toString());
        System.out.println(triangule.toString());
    }
}
