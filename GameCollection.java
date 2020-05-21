/*I pledge my Honor that I have not cheated, and will not cheat, on this assignment 
  Patrick Jean-Baptiste, U70679960*/
  
import java.text.NumberFormat;
  
public class GameCollection
{
   private VideoGame [] collection;
   private int amount;
   private double totalPrice;
   
   public GameCollection()
   {
      collection = new VideoGame[100];
      amount = 0;
      totalPrice = 0.0;
   }
   
   //Add a video game to the collection
   public void addGame(String title, String publisher, String platform, int year,
   double price, boolean isComplete)
   {
      if (amount == collection.length)
      increaseSize();
      
      collection[amount] = new VideoGame(title, publisher, platform, year, price, isComplete);
      totalPrice += price;
      amount++;
   }
   
   //Prints out a report on the video game collection
   public String toString()
   {
       NumberFormat fmt = NumberFormat.getCurrencyInstance();
       String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
       report += "My DVD Collection\n\n";
       
       report += "Number of Video Games: " + amount + "\n";
       report += "Total price: " + fmt.format(totalPrice) + "\n";
       report += "Average price: " + fmt.format(totalPrice/amount);
       
       report += "\n\nVideo Game List:\n\n";
       
       for (int game = 0; game < amount; game++)
       report += collection[game].toString() + "\n";
       
     return report;
   }
   
   //Increase the capacity of the video game collection.
   private void increaseSize()
   {
       VideoGame[] temp = new VideoGame[collection.length * 2];
       
       for (int game = 0; game < collection.length; game++)
         temp[game] = collection[game];
       
       collection = temp;
   }
   
}