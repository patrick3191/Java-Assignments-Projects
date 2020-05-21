/* I pledge my Honor that I have not cheated, and will not cheat, on this assignment
Patrick Jean-Baptiste, U70679960 */

import java.util.Scanner;

public class TwelveDays 
{
   public static void main (String[] args)
   {
      final int MAX = 12;
      int numberOfDays = 0;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("How many days (1 to 12)? \n");
      numberOfDays = scan.nextInt();
      
      while (numberOfDays < 1 || numberOfDays > 12)
      {
       System.out.println("It must be within the range from 1 to 12 please. Enter again.");
       numberOfDays = scan.nextInt();
       
      }
      
      int day = 1;
      
      while (day <= numberOfDays)
      {
         String part1 = "On the ";
         String part2 = "day of Christmas, my true love gave to me";
         String first = "st";
         String second = "nd";
         String third = "rd";
         String remainder = "th";
         
         
         switch (day)
         {
            case 12:
            System.out.println(part1 + day + remainder + " " + part2);
            break;
            case 11:
            System.out.println(part1 + day + remainder + " " + part2);
            break;
            case 10:
            System.out.println(part1 + day + remainder + " " + part2);
            break;
            case 9:
            System.out.println(part1 + day + remainder + " " + part2);
            break;
            case 8:
            System.out.println(part1 + day + remainder + " " + part2);
            break;
            case 7:
            System.out.println(part1 + day + remainder + " " + part2);
            break;
            case 6:
            System.out.println(part1 + day + remainder + " " + part2);
            break;
            case 5:
            System.out.println(part1 + day + remainder + " " + part2);
            break;
            case 4:
            System.out.println(part1 + day + remainder + " " + part2);
            break;
            case 3:
            System.out.println(part1 + day + third + " " + part2);
            break;
            case 2:
            System.out.println(part1 + day + second + " " + part2);
            break;
            case 1:
            System.out.println(part1 + day + first + " " + part2);
            break; 
         
         }
         
         switch (day)
         {
            case 12:
            System.out.println("Twelve drummers drumming,");
            case 11:
            System.out.println("Eleven pipers piping,");
            case 10:
            System.out.println("Ten lords a-leaping,");
            case 9:
            System.out.println("Nine ladies dancing,");
            case 8:
            System.out.println("Eight maids a-milking,");
            case 7:
            System.out.println("Seven swans a-swimming,");
            case 6:
            System.out.println("Six geese a-laying,");
            case 5:
            System.out.println("Five golden rings,");
            case 4:
            System.out.println("Four calling birds,");
            case 3:
            System.out.println("Three French hens,");
            case 2:
            System.out.println("Two turtle doves, and");
            case 1:
            System.out.println("A partridge in a pear tree.");
            break;
            
         }
            day++;
      
      }      
   
   }

}