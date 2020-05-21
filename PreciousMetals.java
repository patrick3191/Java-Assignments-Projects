/*I pledge my Honor that I have not cheated, and will not cheat, on this test 
  Patrick Jean-Baptiste, U70679960*/
  
import java.text.NumberFormat;

public class PreciousMetals 
{
   private String name, symbol;
   private double ouncePrice, ounceAmount;
   
   public PreciousMetals(String name, double ounceAmount)
   {
      this.name = name;
      this.ounceAmount = ounceAmount;
      setSymbol();
      setPrice();
   
   }
   
   private void setSymbol()
   {
      switch (name.toLowerCase())
      {
         case "platinum": symbol = "Pt";
                          break;
         case "palladium": symbol = "Pd";
                          break;
         case "rhodium": symbol = "Rh";
                          break;
         case "iridium": symbol = "Ir";
                          break;
         case "ruthenium": symbol = "Ru";
                          break;
         case "osmium": symbol = "Os";
                          break;
         case "rhenium": symbol = "Re";
                          break;
         case "gold": symbol = "Au";
                          break;
         case "silver": symbol = "Ag";
                          break;
         default: symbol = "Not precious metal";                                                                                                                                                       
         
      }
   
   }
   
   private void setPrice()
   {
      switch (name.toLowerCase())
      {
      case "platinum": ouncePrice = 844;
                          break;
      case "palladium": ouncePrice = 1150;
                          break;
      case "rhodium": ouncePrice = 2590;
                          break;                    
      case "iridium": ouncePrice = 1485;
                          break;                                        
      case "ruthenium": ouncePrice = 270;
                          break;
      case "osmium": ouncePrice = 400;
                          break;                    
      case "rhenium": ouncePrice = 107.50;
                          break;
      case "gold": ouncePrice = 1227.73;
                          break;
      case "silver": ouncePrice = 14.33;
                          break;
      default: ouncePrice = 0;
      
      }                                                            
                                              
   } 
   
   private double calcCost ()
   {
      return ouncePrice * ounceAmount;
      
   }
   
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();;
      return "Name: " + name + "\t\t\t" +
             "Symbol: " + symbol + "\t\t" + 
             "Price per ounce: " + fmt.format(ouncePrice) + "\t\t" +
             "Amount of ounces: " + ounceAmount + "\t\t" +
             "Cost per metal: " + fmt.format(calcCost());
   
   }


}