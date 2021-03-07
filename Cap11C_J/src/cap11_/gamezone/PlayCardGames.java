/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11_.gamezone;

/**
 *
 * @author ALEW
 */
public class PlayCardGames {
    public static void playCardGames(){
        Poker poker = new Poker();
        Bridge bridge = new Bridge();
        System.out.println("POKER:");
        poker.displayDescription();
        poker.deal();
        System.out.println("BRIDGE:");
        bridge.displayDescription();
        bridge.deal();
    }
}
