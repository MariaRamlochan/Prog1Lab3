/*
 * Calculating the area of a circle with an inputed given by a user.
 * Beyond the textbook question 1.
 */
package Lab3;
import java.util.*;
/**
 *
 * @author maria
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n**** CALCULATING THE AREA OF A CIRCLE ****");
        
        // Variables
        double area, radius;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a value for radius: ");
        radius = sc .nextDouble();
        
        if (radius <= 0) {
            System.out.println("Radius cannot be a negative number or zero, "
                    + "please enter again!");
        } else {
            area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: ");
        System.out.printf("%.2f", area);
        System.out.println();
        }
    }
        
}