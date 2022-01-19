/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unocardgame.deck;

import java.util.Arrays;

/**
 *
 * @author nishino
 * Class that contains all of the cards in a Uno Card Game. 
 * A UNO deck consists of 108 cards, of which there are 76 Number cards, 24 Action cards and 8 Wild cards.
 * UNO cards have four color "suits", which are red, yellow, blue and green.
 * 
 */
public class Deck {
    
    // 19 cards for each colored number card 
    private boolean [] Red = new boolean[19];
    private boolean [] Green = new boolean[19];
    private boolean [] Blue = new boolean[19];
    private boolean [] Yellow = new boolean[19];
    
    // 2 cards for each colored "+2" action card
    private boolean [] ActionRed2 = new boolean[2];
    private boolean [] ActionGreen2 = new boolean[2];
    private boolean [] ActionBlue2 = new boolean[2];
    private boolean [] ActionYellow2 = new boolean[2];
    
    // 2 cards for each colored "Skip" action card
    private boolean [] ActionRedSkip = new boolean[2];
    private boolean [] ActionGreenSkip = new boolean[2];
    private boolean [] ActionBlueSkip = new boolean[2];
    private boolean [] ActionYellowSkip = new boolean[2];
    
    // 2 cards for each colored "Reverse" action card
    private boolean [] ActionRedReverse = new boolean[2];
    private boolean [] ActionGreenReverse = new boolean[2];
    private boolean [] ActionBlueReverse = new boolean[2];
    private boolean [] ActionYellowReverse = new boolean[2];
    
    // 4 cards for each "wild" or "wild + draw 4" action card
    private boolean [] ActionWild = new boolean[4];
    private boolean [] ActionWildDraw4 = new boolean [4];

    
    //constructor for the deck, should set every card in the deck to true or false
    //depending on if it is initialized on the table or on the player
    public Deck(boolean init) {
        Arrays.fill(Red, init);
        Arrays.fill(Green, init);
        Arrays.fill(Blue, init);
        Arrays.fill(Yellow, init);
        
        Arrays.fill(ActionRed2,init);
        Arrays.fill(ActionGreen2,init);
        Arrays.fill(ActionBlue2,init);
        Arrays.fill(ActionYellow2,init);
        
        Arrays.fill(ActionRedSkip,init);
        Arrays.fill(ActionGreenSkip,init);
        Arrays.fill(ActionBlueSkip,init);
        Arrays.fill(ActionYellowSkip,init);
        
        Arrays.fill(ActionRedReverse,init);
        Arrays.fill(ActionGreenReverse,init);
        Arrays.fill(ActionBlueReverse,init);
        Arrays.fill(ActionYellowReverse,init);
        
        Arrays.fill(ActionWild,init);
        Arrays.fill(ActionWildDraw4,init);
    }
    
    
    
    
}
