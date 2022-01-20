/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deck;

/**
 *
 * @author nishino
 */
public class Card {
    
    private int cardNumber;
    private int cardColor;
    private boolean actionCard;
    private int cardType;
    private boolean discarded;

    public Card(int cardNumber, int cardColor, boolean actionCard, int cardType, boolean discarded) {
        this.cardNumber = cardNumber;
        this.cardColor = cardColor;
        this.actionCard = actionCard;
        this.cardType = cardType;
        this.discarded = discarded;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getCardColor() {
        return cardColor;
    }
    
    public String getCardColorString() {
        return switch (cardColor) {
            case 0 -> "No color";
            case 1 -> "Red";
            case 2 -> "Green";
            case 3 -> "Blue";
            case 4 -> "Yellow";
            default -> "No color";
        };
    }
    
    public String getCardTypeString() {
        return switch (cardType) {
            case -1 -> "Color Card";
            case 0 -> "Wild Card";
            case 1 -> "Wild Draw 4";
            case 2 -> "Reverse";
            case 3 -> "Skip";
            case 4 -> "Draw +2";
            default -> "Not recognized";
        };
    }

    public boolean isActionCard() {
        return actionCard;
    }

    public int getCardType() {
        return cardType;
    }

    public boolean isDiscarded() {
        return discarded;
    }

    public void setDiscarded(boolean discarded) {
        this.discarded = discarded;
    }
    
    
}
