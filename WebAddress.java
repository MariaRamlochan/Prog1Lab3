/*
 * Program that reads and output the type of web address provided by the user.
 * Question 49 from the textbook.
 */
package Lab3;
import java.util.*;
/**
 *
 * @author maria
 */
public class WebAddress {
    
    public static void main(String[] args) {
        System.out.println("\n**** WED ADDRESS READER ****");
        
        //Variables
        String address;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a wed address: ");
        address = sc.next();
        
        //Testing : https://github.com
        
        if (address.endsWith(".gov")) {
            System.out.println("This is a government web address");
        } else if (address.endsWith(".edu")) {
            System.out.println("This is a university web address");
        } else if (address.endsWith(".com")) {
            System.out.println("This is a business web address");
        } else if (address.endsWith(".org")) {
            System.out.println("This is an organization web address");
        } else {
            System.out.println("This is a web address from another entity");
        }
    }
}