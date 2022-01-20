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
    
    
    public Player() {
        for(int i=0; i<cardsOnHand.length;i++)
            cardsOnHand[i] = new Card(true);
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addToHand(Card[] arrayOfCards) {
        
    }
    
    
}
