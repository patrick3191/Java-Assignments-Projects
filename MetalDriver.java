/*I pledge my Honor that I have not cheated, and will not cheat, on this test 
  Patrick Jean-Baptiste, U70679960*/
  
import java.util.Scanner;

public class MetalDriver
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int amountOfMetals;
      String metalName;
      double AmountOfOunces;
      
      System.out.println("How many metals are you interested in?");
      amountOfMetals = scan.nextInt();
      
      while (amountOfMetals < 1)
      {
         System.out.println("The amount must be >= 1: ");
         amountOfMetals = scan.nextInt();
      
      }
      
      PreciousMetals [] MetalArray = new PreciousMetals[amountOfMetals];
      
      for(int i = 0; i < amountOfMetals; i++)
      {
         System.out.println("Enter name of metal: " + "");
         metalName = scan.nextLine();
         
         
         while (amountOfOunces < 0)
         {
            System.out.println("Amount must be > 0. Re-enter: ")
            amountOfOunces = scan.nextDouble();
         }
      
      }
      
   
   }

}