/* I pledge my Honor that I have not cheated, and will not cheat, on this assignment
Patrick Jean-Baptiste, U70679960 */

import javax.swing.JOptionPane;

public class VowelCount 
{
   public static void main (String[] args) 
   {
      String response;
      int a = 0, e = 0, i = 0, o = 0, u = 0;
     
      do 
      { 
         String input = JOptionPane.showInputDialog("Enter a string of characters please.");
          
          for (int t = 0; t < input.length(); t++)
         {
            switch (input.charAt(t))
            {
               case 'a':
               case 'A':
               a++;
               break;
               case 'e':
               case 'E':
               e++;
               break;
               case 'i':
               case 'I':
               i++;
               break;
               case 'o':
               case 'O':
               o++;
               break;
               case 'u':
               case 'U':
               u++;
               break;
            
            }
      
         }
         JOptionPane.showMessageDialog(null, "There are the numbers of vowels in the string :\na: " + a + "\ne: " + e +
         "\ni: " + i + "\no: " + o + "\nu: " + u +
         "\nNumber of non vowel characters as well : " +
         (input.length() - (a + e + i + o + u)));
         
         response = JOptionPane.showInputDialog(null, "Would you like to try again? \nYes or no: ");
         
      }while(response.equalsIgnoreCase("yes"));
   
      System.exit(0);
   }
   
}