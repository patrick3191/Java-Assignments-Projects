/*I pledge my Honor that I have not cheated, and will not cheat, on this assignment 
  Patrick Jean-Baptiste, U70679960*/
  
import java.text.NumberFormat;

public class VideoGame
{
   private String title, publisher, platform;
   private int year;
   private double price;
   private boolean isComplete;
   
   public VideoGame(String title, String publisher, String platform, int year, double price,
   boolean isComplete)
   {
      this.title = title;
      this.publisher = publisher;
      this.platform = platform;
      this.year = year;
      this.price = price;
      this.isComplete = isComplete;
   } 
   
   public String toString()
   {
       NumberFormat fmt = NumberFormat.getCurrencyInstance();
       
       String description;
       
       description = fmt.format(price) + "\t" + year + "\t";
       description += title + "\t" + publisher;
       
       if (isComplete)
       description += "\t" + "Finished";
       
       return description;
   }
 
}

