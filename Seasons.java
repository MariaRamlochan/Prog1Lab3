/*
 * Program that reads a probable season base on the imputed tempreture.
 * Question 50 from the textbook.
 */
package Lab3;
import java.util.*;
/**
 *
 * @author maria
 */
public class Seasons {
    
    public static void main(String[] args) {
        System.out.println("\n**** SEASON BASE ON THE TEMPRETURE ****");
        
        //Variables
        int tempreture;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tempreture in Fahrenheit");
        tempreture = sc.nextInt();
        
        if (tempreture >= 90) {
            System.out.println("It is probably Summer");
        } if (tempreture >= 70 && tempreture < 90) {
            System.out.println("It is probably Spring");
        } if (tempreture >= 50 && tempreture < 70) {
            System.out.println("It is probably Fall");
        } if (tempreture < 50) {
            System.out.println("It is probably Winter");
        } if (tempreture > 110 && tempreture < -5) {
            System.out.println("The tempreture entered is outside the"
                    + " VALID RANGE");
        }
    }
}