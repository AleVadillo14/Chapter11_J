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
public class UsePlayer {
    public static void usePlayer(){
        Child child = new Child();
        Musician musician = new Musician();
        Actor actor = new Actor();
        
        child.play();
        musician.play();
        actor.play();
    }
}
