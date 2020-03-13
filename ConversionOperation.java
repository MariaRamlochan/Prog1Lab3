/*
 * Five different conversion operations. 
 * Choises given with a user selections from option one through five. 
 * Beyond the textbook question 4.
 */
package Lab3;
import java.util.*;
/**
 *
 * @author maria
 */
public class ConversionOperation {
    
    public static void main(String[] args) {
        System.out.println("\n**** DIFFRENT CONVERSION OPERATION ****");
        
        //Variables
        double meter, feet, CAD, USD, seconds, minutes, decimal, percentage;
        int choise, celsius, fahrenheit;
        
        System.out.println("Please select one of the following options");
        System.out.println("(1) Meters to Feet");
        System.out.println("(2) CAD to USD");
        System.out.println("(3) Celsius to Fahrenheit");
        System.out.println("(4) Seconds to Minutes");
        System.out.println("(5) Decimal to Percentage");

        Scanner sc = new Scanner(System.in);
        choise = sc.nextInt();
        
        if (choise == 1) {
            System.out.println("Enter the number of meters: ");
            meter = sc.nextDouble();
            feet = meter * 3.28084;
            System.out.println("Total in Meters in Feet is: ");
            System.out.printf("%.2f\n", feet);
        } else if (choise == 2) {
            System.out.println("Enter the amount in CAD: ");
            CAD = sc.nextDouble();
            USD = CAD * 0.73;
            System.out.println("Total in USD is: ");
            System.out.printf("%.2f", USD);
            System.out.println("$\n");
        } else if (choise == 3) {
            System.out.println("Enter the Tempreture in Celsius: ");
            celsius = sc.nextInt();
            fahrenheit = (celsius * 9/5) + 32;
            System.out.println("The Tempreture in Fahrenheit is: " 
                    + fahrenheit);
        } else if (choise == 4) {
            System.out.println("Enter the number of Seconds: ");
            seconds = sc.nextInt();
            minutes = seconds * 0.0166667;
            System.out.println("Total Seconds to Minutes is: ");
            System.out.printf("%.2f\n", minutes);
        } else if (choise == 5) {
            System.out.println("Enter a Decimal value: ");
            decimal = sc.nextDouble();
            percentage = decimal * 100;
            System.out.println("Total in Percentage is: ");
            System.out.printf("%.2f", percentage);
            System.out.println("%\n");
        } else {
            System.out.println("Invalid");
        }
     }
}