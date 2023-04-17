package oophust;

import java.util.Scanner;

public class day {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int month, year;

      do {
         System.out.print("Enter the month (1-12): ");
         month = input.nextInt();
         if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
         }
      } while (month < 1 || month > 12);

      do {
         System.out.print("Enter the year: ");
         year = input.nextInt();
         if (year < 0) {
            System.out.println("Invalid year. Please enter a positive integer.");
         }
      } while (year < 0);

      int numDays;
      switch(month) {
         case 2:
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
               numDays = 29;
            } else {
               numDays = 28;
            }
            break;
         case 4:
         case 6:
         case 9:
         case 11:
            numDays = 30;
            break;
         default:
            numDays = 31;
            break;
      }

      System.out.println("The number of days in month " + month + " of year " + year + " is " + numDays);
   }
}