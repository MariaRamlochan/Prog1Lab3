/*
 * Program that confirm's and welcome's the user with an ID between 6 and 10 
 * character's long.
 * Question 48 from the textbook.
 */
package Lab3;
import java.util.*;
/**
 *
 * @author maria
 */
public class UserID {
    
    public static void main(String[] args) {
         System.out.println("\n**** USER'S ID ****");
         
         //Variables
         String id;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a User ID between "
                 + "6 to 10 characters long: ");
         id = sc.nextLine();
         
         //For testing purposses : Barbara/Maria/PLAYER345674245/Princess_1
         if (id.length() >= 6 && id.length() <=10) {
             System.out.println("WELCOME, " + id);
         } else {
             System.out.println("INVALID, ID doesn't follow the requirements, "
                     + "please enter again!");
         }
    }
}
