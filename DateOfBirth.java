/*
 * Program that prompts the user for their birthday and outputs their age and 
   the number of days until their birthday or how many days was their birthday.
 * Beyond the textbook question 5.
 */
package Lab3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
/**
 *
 * @author maria
 */
public class DateOfBirth {
    
     public static void main(String[] args) {
         System.out.println("\n**** DATE OF BIRTH ****");
         
         //Variables
         Date today = new Date();
         String birthday, yearOfBirth, monthOfBirth, dayOfBirth;
         int days, year = today.getYear(), month = today.getMonth(),
                 day = today.getDate(), currentYear = year + 1900, 
                 currentMonth = month + 1, currentDay = day, age;
                 
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your birthday in the format YYYY-MM-DD: ");
         birthday = sc.nextLine();
         
         //Making the birthday in format YYYY-MM-DD
         yearOfBirth = birthday.substring(0, 4);
         monthOfBirth = birthday.substring(5, 7);
         dayOfBirth = birthday.substring(8, 10);
         
         System.out.println(yearOfBirth + "-" + monthOfBirth + "-" + dayOfBirth);
        
         /*Verifying if the current year is a regular year or a leap year*/
         if (currentYear % 4 == 0) {
            days = 366;
         } else {
            days = 365;
         }
         
         /*Converting the birthday String into int*/
         int year2 = Integer.parseInt(yearOfBirth);
         int month2 = Integer.parseInt(monthOfBirth);
         int day2 = Integer.parseInt(dayOfBirth);
         
         /*Getting the user's age*/
         age = currentYear - year2;
         if (month2 >= currentMonth) {
             age = age - 1; 
         }
         System.out.println("You are " + age + " years old");
         
         /*Turning my date into a string*/
         DateFormat presentDay = new SimpleDateFormat("yyyy-MM-dd");
         String rightNow = presentDay.format(today);
         
         /*Converting the birthday String and current date into LocalDate*/
         LocalDate newBirthday = LocalDate.parse(birthday);
         LocalDate now = LocalDate.parse(rightNow);
         
         /*Making the the birth year equal to the current year to calculate 
         only days and months*/
         
         
         /*Checking how many days until the user's birthday and checking if the 
         day has passed*/
         if (month2 <= currentMonth) {
             long totalDays = ChronoUnit.DAYS.between(newBirthday, now);
             System.out.println("Your Birthday was " + totalDays + " days ago");
         } else if (month2 >= currentMonth) {
             long totalDays = ChronoUnit.DAYS.between(now, newBirthday);
             System.out.println("Your Birthday is in " + totalDays + " days");
         }

     }
}