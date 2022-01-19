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
    
    private static final int red = 0;
    private static final int green = 1;
    private static final int blue = 2;
    private static final int yellow = 3;
    private static final int actionRed2 = 4;
    private static final int actionGreen2 = 5;
    private static final int actionBlue2 = 6;
    private static final int actionYellow2 = 7;
    private static final int actionRedSkip = 8;
    private static final int actionGreenSkip = 9;
    private static final int actionBlueSkip = 10;
    private static final int actionYellowSkip = 11;
    private static final int actionRedReverse = 12;
    private static final int actionGreenReverse = 13;
    private static final int actionBlueReverse = 14;
    private static final int actionYellowReverse = 15;
    private static final int actionWild = 16;
    private static final int actionWildDraw4 = 17;
    
   
    private boolean fullDeck[][] = new boolean[18][];

    
    //constructor for the deck, should set every card in the deck to true or false
    //depending on if it is initialized on the table or on the player
    public Deck(boolean init) {
        fullDeck[red] = new boolean[19];
        fullDeck[green] = new boolean[19];
        fullDeck[blue] = new boolean[19];
        fullDeck[yellow] = new boolean[19];
        
        fullDeck[actionRed2] = new boolean[2];
        fullDeck[actionGreen2] = new boolean[2];
        fullDeck[actionBlue2] = new boolean[2];
        fullDeck[actionYellow2] = new boolean[2];
        
        fullDeck[actionRedSkip] = new boolean[2];
        fullDeck[actionGreenSkip] = new boolean[2];
        fullDeck[actionBlueSkip] = new boolean[2];
        fullDeck[actionYellowSkip] = new boolean[2];
        
        fullDeck[actionRedReverse] = new boolean[2];
        fullDeck[actionGreenReverse] = new boolean[2];
        fullDeck[actionBlueReverse] = new boolean[2];
        fullDeck[actionYellowReverse] = new boolean[2];
        
        fullDeck[actionWild] = new boolean[4];
        fullDeck[actionWildDraw4] = new boolean[4];
        
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
