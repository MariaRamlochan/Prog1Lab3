/*
 * Calculating the tempreture above or below 0 with an input from the user. 
 * Beyond the textbook question 3.
 */
package Lab3;
import java.util.*;
/**
 *
 * @author maria
 */
public class TempretureInCelsius {
    
    public static void main(String[] args) {
        System.out.println("\n**** CALCULATING IF TEMPRETURE IS "
                + "ABOVE OR BELOW 0 ****");
        
        //Variables
        int tempreture;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tempreture in Celsius: ");
        tempreture = sc .nextInt();
        System.out.println( tempreture > 0 ? "Tempreture is above 0":
            "Tempreture is below 0");
   }
}