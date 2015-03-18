package cs520.module1.L2_datatypes;
/*
 * Breaks dollar amounts into coins less than one dollar
 * using integer for the dollar amount 
 */
 
import javax.swing.JOptionPane;

public class P02_BreakMoneyAmountIntoCoins
{  
   public static void main(String[] args)
   {  
      System.out.println("Breaks money amount into the minimal number of coins of less than $1 value");
      int dollars, cents, moneyAmount;//moneyAmount is in cents
      
      //Input
      String input = JOptionPane.showInputDialog("Enter dollars");
      dollars = Integer.parseInt(input);
      input = JOptionPane.showInputDialog("Enter cents");
      cents = Integer.parseInt(input);
      moneyAmount = dollars*100 + cents;//compute moneyAmount in cents
      
      //Computation      
      int quarters, dimes, nickels, pennies;
      int remainder;
      quarters = moneyAmount/25; 
      int totalCoins=0;
      totalCoins = totalCoins + quarters; //same as totalCoins += quarters; provided totalCoins was properly initialized
      remainder = moneyAmount%25;
      dimes = remainder/10;
      totalCoins += dimes;
      remainder = remainder%10;     
      nickels = remainder/5;
      totalCoins += nickels;
      remainder = remainder%5; 
      pennies = remainder;
      totalCoins += pennies;
      
      //Output
      System.out.println("$ " + dollars + "." + cents + " has" );
      System.out.println(quarters + " quarters ");
      System.out.println(dimes + " dimes "); 
      System.out.println(nickels + " nickels ");
      System.out.println(pennies + " pennies ");
      System.out.println("The total number of coins is " + totalCoins);        
   }
}