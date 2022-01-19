/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deck;

/**
 *
 * @author nishino
 */
public class DeckDivision {
    public static final int red = 0;
    public static final int green = 1;
    public static final int blue = 2;
    public static final int yellow = 3;
    public static final int actionRed2 = 4;
    public static final int actionGreen2 = 5;
    public static final int actionBlue2 = 6;
    public static final int actionYellow2 = 7;
    public static final int actionRedSkip = 8;
    public static final int actionGreenSkip = 9;
    public static final int actionBlueSkip = 10;
    public static final int actionYellowSkip = 11;
    public static final int actionRedReverse = 12;
    public static final int actionGreenReverse = 13;
    public static final int actionBlueReverse = 14;
    public static final int actionYellowReverse = 15;
    public static final int actionWild = 16;
    public static final int actionWildDraw4 = 17;
    
    public static String getCardType(int cardID) {
        switch(cardID) {
            case 0:
                return "Red";
            case 1:
                return "Green";
            case 2:
                return "Blue";
            case 3:
                return "Yellow";
            case 4:
                return "Red [+2]";
            case 5:
                return "Green [+2]";
            case 6:
                return "Blue [+2]";
            case 7:
                return "Yellow [+2]";
            case 8:
                return "Red [SKIP]";
            case 9:
                return "Green [SKIP]";
            case 10:
                return "Blue [SKIP]";
            case 11: 
                return "Yellow [SKIP]";
            case 12:
                return "Red [REVERSE]";
            case 13:
                return "Green [REVERSE]";
            case 14:
                return "Blue [REVERSE]";
            case 15:
                return "Yellow [REVERSE]";
            case 16:
                return "Wild Card!!!";
            case 17:
                return "Wild Card!!! [+4]";
            default:
                return "Card not recognized";
        }
    }
    
    
    
    
}
