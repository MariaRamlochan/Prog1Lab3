/*
 * Program that prompts the user for their birthday and outputs their age and 
   the number of days until their birthday.
 * Beyond the textbook question 5.
 */
package Lab3;
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
         int year = today.getYear(), month = today.getMonth(),
                 day = today.getDate(), currentYear = year + 1900,
                 currentMonth = month + 1, currentDay = day,
                 days, dayCount, amountOfDays, check, yearOfBirthday, age;
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your birthday in the format YYYY-MM-DD: ");
         birthday = sc.nextLine();
         
         //Making the birthday in format YYYY-MM-DD
         yearOfBirth = birthday.substring(0, 4);
         monthOfBirth = birthday.substring(5, 7);
         dayOfBirth = birthday.substring(8, 10);
         
         System.out.println(yearOfBirth + "-" + monthOfBirth + "-" + dayOfBirth);
        
         //Verifying if the current year is a regular year or a leap year
         if (currentYear % 4 == 0) {
            days = 366;
         } else {
            days = 365;
         }
         
         //Converting the birthday String into int
         int year2 = Integer.parseInt(yearOfBirth);
         int month2 = Integer.parseInt(monthOfBirth);
         int day2 = Integer.parseInt(dayOfBirth);
         
         //Getting the amount of days since the user's birthday
         amountOfDays = days/12; //Getting the number of days in a month
         check = (amountOfDays * currentMonth) + currentDay;
         dayCount = amountOfDays + month2 + day2 + check;
         yearOfBirthday = (month2 - currentMonth) * (day2 + currentDay);
         
         //Getting the age
         age = currentYear - year2;
         if (yearOfBirthday >= 0) {
             age = age - 1; 
         }
         System.out.println("You are " + age + " years old");
         
         //Making sure your birthday was this year
         if (yearOfBirthday >= 0) {
             yearOfBirthday = currentYear; 
         }
         
         /*Checking how many days until the user's birthday and checking if the 
         day has passed*/
         /*int remaining = dayCount;
         int remaining2 = remaining;
         int passed = dayCount;
         int passed2 = Math.abs(passed - 2);
         
         if (month2 >= 11 && day2 >= 1 && dayCount > 0) {
             System.out.println("Your birthday is in " + remaining2 + " days");
         } else if (dayCount > 0 && dayCount <= days && 
                 yearOfBirthday == currentYear) { 
             System.out.println("Your birthday is in " + remaining + " days");
         } else {
             System.out.println("Your birthday was " + passed2 + " days ago");
         }*/
     }
}