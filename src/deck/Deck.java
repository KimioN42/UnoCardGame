/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deck;

import java.util.Arrays;
import deck.DeckDivision;

/**
 *
 * @author nishino
 * Class that contains all of the cards in a Uno Card Game. 
 * A UNO deck consists of 108 cards, of which there are 76 Number cards, 24 Action cards and 8 Wild cards.
 * UNO cards have four color "suits", which are red, yellow, blue and green.
 * 
 */
public class Deck {
    
    private boolean fullDeck[][] = new boolean[18][];

    
    //constructor for the deck, should set every card in the deck to true or false
    //depending on if it is initialized on the table or on the player
    public Deck(boolean init) {
        fullDeck[DeckDivision.red] = new boolean[19];
        fullDeck[DeckDivision.green] = new boolean[19];
        fullDeck[DeckDivision.blue] = new boolean[19];
        fullDeck[DeckDivision.yellow] = new boolean[19];
        
        fullDeck[DeckDivision.actionRed2] = new boolean[2];
        fullDeck[DeckDivision.actionGreen2] = new boolean[2];
        fullDeck[DeckDivision.actionBlue2] = new boolean[2];
        fullDeck[DeckDivision.actionYellow2] = new boolean[2];
        
        fullDeck[DeckDivision.actionRedSkip] = new boolean[2];
        fullDeck[DeckDivision.actionGreenSkip] = new boolean[2];
        fullDeck[DeckDivision.actionBlueSkip] = new boolean[2];
        fullDeck[DeckDivision.actionYellowSkip] = new boolean[2];
        
        fullDeck[DeckDivision.actionRedReverse] = new boolean[2];
        fullDeck[DeckDivision.actionGreenReverse] = new boolean[2];
        fullDeck[DeckDivision.actionBlueReverse] = new boolean[2];
        fullDeck[DeckDivision.actionYellowReverse] = new boolean[2];
        
        fullDeck[DeckDivision.actionWild] = new boolean[4];
        fullDeck[DeckDivision.actionWildDraw4] = new boolean[4];
        
        for(int i = 0; i < 18; i++) {
            Arrays.fill(fullDeck[i], init);
        }
        
    }
    
    public void showFullDeck() {
        for (int i = 0; i < fullDeck.length; i++) {
            System.out.print(DeckDivision.getCardType(i) + " - ");
            for(int j=0; j < fullDeck[i].length; j++) {
                System.out.print(fullDeck[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    
    
}
