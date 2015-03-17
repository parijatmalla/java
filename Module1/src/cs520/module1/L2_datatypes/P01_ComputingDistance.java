package cs520.module1.L2_datatypes;
/*
 * Application computes distance traveled 
 * based on initial position and speed 
 */

import javax.swing.JOptionPane;

public class P01_ComputingDistance
{  
   public static void main(String[] args)
   {  
      System.out.println("Computes distance traveled and final position reached");
      System.out.println(" given initial position, time, and average speed");
      double initialPosition, speed, time;
      //Input
      String input = JOptionPane.showInputDialog("Enter initial position");
      initialPosition = Double.parseDouble(input);
      input = JOptionPane.showInputDialog("Enter time in hours");
      time = Double.parseDouble(input);
      input = JOptionPane.showInputDialog("Enter speed in miles per hour");
      speed = Double.parseDouble(input);
      
      //Computation
      double distanceTraveled, finalPosition;
      distanceTraveled = speed*time;
      finalPosition = initialPosition + distanceTraveled;
      
      //Output - console      
      System.out.println("Starting from initial position " + initialPosition);
      System.out.println("and traveling with average speed of " + speed + " miles per hour");
      System.out.println("for " + time +" hours"); 
      System.out.println("the total distance traveled is " + distanceTraveled + " miles");   
      System.out.println("and the final position reached is " + finalPosition);     
   }
}