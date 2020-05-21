/*I pledge my Honor that I have not cheated, and will not cheat, on this assignment 
  Patrick Jean-Baptiste, U70679960*/
  
public class GameDriver
{
   public static void main(String [] args)
   {
      GameCollection gamelist = new GameCollection();
      
      gamelist.addGame("Spider-Man", "Insomniac Games", "PlayStation 4", 2018, 49.99, false);
      gamelist.addGame("Grand Theft Auto 5", "Rockstar Games", "PlayStation 4", 2013, 29.99, true);
      gamelist.addGame("Call of Duty: Black Ops 4", "Activision", "PlayStation 4", 2018, 59.99, false);  
      
      System.out.println(gamelist);
      
      gamelist.addGame("Halo: Combat Evolved", "Bungie", "Xbox", 2001, 12.00, true);
      gamelist.addGame("God of War", "SIE Santa Monica Studio", "PlayStation 4", 2018, 49.99, false);
      gamelist.addGame("Assassin's Creed: Origins", "Ubisoft Montreal", "PlayStation 4", 2017, 44.99, false);
      
      System.out.println(gamelist);
   
   }  

}