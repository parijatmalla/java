package cs520.module1.L2_datatypes;
/*
 * Breaks dollar amounts into coins less than one dollar
 * using integer for the dollar amount 
 */
 
import javax.swing.JOptionPane;

public class P03_BreakMoneyAmountIntoCoins
{  
   public static void main(String[] args)
   {  
      System.out.println("Breaks money amount into the minimal number of coins of less than $1 value");
      int centAmount;//centAmount is in cents
      
      //Input
      double dollarAmount;
	String input = JOptionPane.showInputDialog("Enter dollar amount in decimal form, e.g. 1.16");
	dollarAmount = Double.parseDouble(input); 
	System.out.println("The amount you entered in dollars is "+ dollarAmount);

	centAmount = (int) (dollarAmount * 100); //compute centAmount in cents

    System.out.println("The amount you entered in cents is "+ centAmount);
  
      //Computation      
      int quarters, dimes, nickels, pennies;
      int remainder;
      quarters = centAmount/25; 
      int totalCoins=0;
      totalCoins = totalCoins + quarters; //same as totalCoins += quarters; provided totalCoins was properly initialized
      remainder = centAmount%25;
      dimes = remainder/10;
      totalCoins += dimes;
      remainder = remainder%10;     
      nickels = remainder/5;
      totalCoins += nickels;
      remainder = remainder%5; 
      pennies = remainder;
      totalCoins += pennies;
      
      //Output
      System.out.println("centAmount " + centAmount);
      System.out.println("$ " + dollarAmount +  " have" );
      System.out.println(quarters + " quarters ");
      System.out.println(dimes + " dimes "); 
      System.out.println(nickels + " nickels ");
      System.out.println(pennies + " pennies ");
      System.out.println("The total number of coins is " + totalCoins);  
   }
}