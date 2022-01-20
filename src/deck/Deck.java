/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deck;

import deck.Card;
import deck.CardProperties;
import java.util.Arrays;
import java.util.Collections;
import game.GameException;

/**
 *
 * @author nishino
 */
public class Deck {
    private Card[] fullDeck = new Card[108]; 
    private Card tableCard = new Card(false);
    private boolean empty;
    private int topOfDeck;
    
    //constructor to initialize whole deck
    //init variable tells if it should start the deck with all cards discarded or not
    public Deck(boolean init) {
        topOfDeck = 0;
        empty = false;
        for(int i=0; i<fullDeck.length; i++) {
            //setting up colored number cards
            if(i<76) {
                //setting up red numbered cards
                if(i<19){
                    if(i<10)
                        fullDeck[i] = new Card(i,CardProperties.RED, false, CardProperties.COLOR_CARD, init);
                    else
                        fullDeck[i] = new Card((i-9),CardProperties.RED, false, CardProperties.COLOR_CARD, init);
                } 
                //setting up green numbered cards
                else if (i<38){
                    if(i<29)
                        fullDeck[i] = new Card((i-19),CardProperties.GREEN, false, CardProperties.COLOR_CARD, init);
                    else
                        fullDeck[i] = new Card((i-28),CardProperties.GREEN, false, CardProperties.COLOR_CARD, init);
                }
                //setting up blue numbered cards
                else if (i<57) {
                    if(i<48)
                        fullDeck[i] = new Card((i-38),CardProperties.BLUE, false, CardProperties.COLOR_CARD, init);
                    else
                        fullDeck[i] = new Card((i-47),CardProperties.BLUE, false, CardProperties.COLOR_CARD, init);
                }
                //setting up yellow numbered cards
                else {
                    if(i<67)
                        fullDeck[i] = new Card((i-57),CardProperties.YELLOW, false, CardProperties.COLOR_CARD, init);
                    else
                        fullDeck[i] = new Card((i-66),CardProperties.GREEN, false, CardProperties.COLOR_CARD, init);
                }
            } //setting up action cards
            else {
                //setting up wild cards
                if(i<80) 
                    fullDeck[i] = new Card(0, CardProperties.NO_COLOR, true, CardProperties.WILD, init);
                //setting up wild draw 4 cards
                else if(i<84) 
                    fullDeck[i] = new Card(0, CardProperties.NO_COLOR, true, CardProperties.WILD_DRAW4, init);
                //setting up draw 2 cards
                else if(i<92) {
                    if(i<86)
                        fullDeck[i] = new Card(0, CardProperties.RED, true, CardProperties.DRAW2, init);
                    else if(i<88)
                        fullDeck[i] = new Card(0, CardProperties.GREEN, true, CardProperties.DRAW2, init);
                    else if(i<90)
                        fullDeck[i] = new Card(0, CardProperties.BLUE, true, CardProperties.DRAW2, init);
                    else
                        fullDeck[i] = new Card(0, CardProperties.YELLOW, true, CardProperties.DRAW2, init);
                }
                else if(i<100) {
                    if(i<94)
                        fullDeck[i] = new Card(0, CardProperties.RED, true, CardProperties.REVERSE, init);
                    else if(i<96)
                        fullDeck[i] = new Card(0, CardProperties.GREEN, true, CardProperties.REVERSE, init);
                    else if(i<98)
                        fullDeck[i] = new Card(0, CardProperties.BLUE, true, CardProperties.REVERSE, init);
                    else
                        fullDeck[i] = new Card(0, CardProperties.YELLOW, true, CardProperties.REVERSE, init);     
                }
                else if(i<108) {
                    if(i<102)
                        fullDeck[i] = new Card(0, CardProperties.RED, true, CardProperties.SKIP, init);
                    else if(i<104)
                        fullDeck[i] = new Card(0, CardProperties.GREEN, true, CardProperties.SKIP, init);
                    else if(i<106)
                        fullDeck[i] = new Card(0, CardProperties.BLUE, true, CardProperties.SKIP, init);
                    else
                        fullDeck[i] = new Card(0, CardProperties.YELLOW, true, CardProperties.SKIP, init);
                }
            }
        }
    }
    
    public void printDeck() {
        for (int i = 0; i < fullDeck.length; i++) {
            if(!fullDeck[i].isActionCard())
                System.out.println("Card " + i + ", color: " + fullDeck[i].getCardColorString() + ", value: " + fullDeck[i].getCardNumber() + ", card type: " + fullDeck[i].getCardTypeString()
                    + ". isDiscarded(): " + fullDeck[i].isDiscarded());  
            else
                System.out.println("Card " + i + ", color: " + fullDeck[i].getCardColorString() + ", card type: " + fullDeck[i].getCardTypeString() 
                    + ". isDiscarded(): " + fullDeck[i].isDiscarded());  
        }
        System.out.println("Top of the deck is: "+topOfDeck);
    }
    
    public void shuffleDeck() {
        Collections.shuffle(Arrays.asList(fullDeck));
    }
    
    public void updateTop() {
        int i = 0;
        while (fullDeck[i].isDiscarded()) {
            i++;
        }
        topOfDeck = i;    
        System.out.println("New top of the deck: " + topOfDeck);
        if(topOfDeck >= fullDeck.length) {
           empty = true;
            System.out.println("Empty deck");
        }     
    }
    
    public Card[] pull(int quantity) throws GameException {
        int end = topOfDeck+ quantity;
        Card[] copy = new Card[quantity];
        copy = Arrays.copyOfRange(fullDeck, topOfDeck, end);
        System.out.println("Cards being pulled: ");
        for(int i=topOfDeck; i < end;i++) {  
            if(!fullDeck[i].isActionCard())
                System.out.println("Card " + i + ", color: " + fullDeck[i].getCardColorString() + ", value: " + fullDeck[i].getCardNumber() + ", card type: " + fullDeck[i].getCardTypeString()
                    + ". isDiscarded(): " + fullDeck[i].isDiscarded());  
            else
                System.out.println("Card " + i + ", color: " + fullDeck[i].getCardColorString() + ", card type: " + fullDeck[i].getCardTypeString() 
                    + ". isDiscarded(): " + fullDeck[i].isDiscarded());      
            fullDeck[i].setDiscarded(true);
        } 
        updateTop();
        return copy;
    }

    public void setTableCard(Card tableCard) {
        this.tableCard = tableCard;
    }

    public Card getTableCard() {
        return tableCard;
    }

    public boolean isEmpty() {
        return empty;
    }
    
    
}
