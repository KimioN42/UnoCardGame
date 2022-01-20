/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unocardgame;

import deck.Deck;
import game.GameException;

/**
 *
 * @author nishino
 */
public class UnoCardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deck table = new Deck(false);
        table.shuffleDeck();
        table.printDeck();
        System.out.println("=====================");
        try{
            table.pull(4);
        } catch (GameException ge) {
            System.out.println("Game exception generated: " + ge.getCode());        
        }
        table.printDeck();
        
    }
    
}
