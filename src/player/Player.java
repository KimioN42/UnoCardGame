/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

import deck.Card;

/**
 *
 * @author nishino
 */
public class Player {
    private String name;
    private Card[] cardsOnHand = new Card[108];
    private int topOfHand;
    
    
    public Player(String name) {
        for(int i=0; i<cardsOnHand.length;i++)
            cardsOnHand[i] = new Card(true);
        topOfHand = 0;
        this.name = name;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addToHand(Card[] arrayOfCards) {
        System.out.println("Player " + name + " pulled " + arrayOfCards.length + " cards.");
        for(int i = topOfHand; i < (topOfHand+arrayOfCards.length); i++)
            cardsOnHand[i] = arrayOfCards[i];
    }
    
    public void showCardsOnHand() {
        for(int i = 0; i < cardsOnHand.length; i++) {
            if(!cardsOnHand[i].isDiscarded()) {
                if(!cardsOnHand[i].isActionCard())
                System.out.println("Card " + i + ", color: " + cardsOnHand[i].getCardColorString() + ", value: " + cardsOnHand[i].getCardNumber() + ", card type: " + cardsOnHand[i].getCardTypeString()
                    + ". isDiscarded(): " + cardsOnHand[i].isDiscarded());  
                else
                    System.out.println("Card " + i + ", color: " + cardsOnHand[i].getCardColorString() + ", card type: " + cardsOnHand[i].getCardTypeString() 
                        + ". isDiscarded(): " + cardsOnHand[i].isDiscarded());
            }
        }
    }    
    
}
