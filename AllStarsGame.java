/*
 * Program calculating if a batter is eligible for the All Stars Game.
 * Question 42 from the textbook.
 */
package Lab3;
import java.util.*;
/**
 *
 * @author maria
 */
public class AllStarsGame {
    
    public static void main(String[] args) {
         System.out.println("\n**** ALL STARTS GAME ****");
        // Variables
        int hits, atBats, percentage;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hits made by the batter: ");
        hits = sc.nextInt();
        System.out.println("Enter the number of at-bats made by the batter: ");
        atBats = sc.nextInt();
        
        percentage = (hits/atBats) * 100;
        System.out.println("Total percentage is: " + percentage);
        if (percentage > 300) {
            System.out.println("Player is eligible for the All Stars Game");
        } else { 
            System.out.println("Player is not eligible for the All Stars Game");
        }
    }
    
}
