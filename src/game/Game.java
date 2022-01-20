/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import player.Player;
import deck.Deck;
import player.PlayerConfig;

/**
 *
 * @author nishino
 */
public class Game {
    private Player[] players = new Player[4];
    private boolean clockwise;
    Deck deck;
    
    //initializing a game
    public Game() {
        deck = new Deck(false);
        deck.shuffleDeck();
        clockwise = true;
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(PlayerConfig.getNameString(i));
            try {
                players[i].addToHand(deck.pull(7));
            } catch (GameException e) {
                System.out.println("Something wrong happened while pulling the initial cards. Code: " + e.getCode());
            }
        }
        
    }
    
    public void play() {
        int currentPlayer = 0;
        while(!deck.isEmpty()) {
            if(clockwise) {
                
                currentPlayer++;
                if(currentPlayer >= players.length)
                    currentPlayer = 0;
            } else {
                
                currentPlayer--;
                if(currentPlayer >= players.length)
                    currentPlayer = 0;
            }
        }
        deck.printDeck();
    }
    
    
}
