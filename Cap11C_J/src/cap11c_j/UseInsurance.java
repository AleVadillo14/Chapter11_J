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
public class UseInsurance {
    public static void useInsecurance(){
        Life life = new Life();
        Health health = new Health();
        System.out.println(life.toString());
        System.out.println(health.toString());
    }
}
