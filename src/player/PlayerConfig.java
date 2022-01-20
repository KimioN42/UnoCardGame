/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author nishino
 */
public class PlayerConfig {
    public static String P1 = "Kimio";
    public static String P2 = "Waqqas";
    public static String P3 = "Emily";
    public static String P4 = "Daniel";
    
    public static String getNameString(int number) {
        return switch(number) {
            case 0 -> "Kimio";
            case 1 -> "Waqqas";
            case 2 -> "Emily";
            case 3 -> "Daniel";
            default -> "No name";
        };
    }
    
}
