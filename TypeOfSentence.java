/*
 * Program that reads and outputs the type of sentence inputed by the users. 
 * Question 45 from the textbook.
 */
package Lab3;
import java.util.*;
/**
 *
 * @author maria
 */
public class TypeOfSentence {
    
    public static void main(String[] args) {
        System.out.println("\n**** TYPE OF SENTENCE ****");
        
        //Variables
        String sentence;
        System.out.println("Enter a sentence: ");
        Scanner sc = new Scanner(System.in); 
        
        sentence = sc.nextLine(); 
        //For testing purposes: I love you. I love you?  I love you! I love you
        if (sentence.endsWith(".")) {
            System.out.println("This sentence is declarative");
        } if (sentence.endsWith("?")) {
            System.out.println("This sentence is interrogative");
        } if (sentence.endsWith("!")) {
            System.out.println("This sentence is exclamatory");
        } else {
            System.out.println("Sentence is missing a period or "
                    + "an interrogative point or an exclamation point");
        }
    }
}