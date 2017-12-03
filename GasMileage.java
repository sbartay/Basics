/**
 * @(#)Encryption.java
 * @author Saffi Bartay
 * @version 1.0 10/14/17 7:54 PM MST
 * 
 * PROGRAM PURPOSE: This program receives input of miles driven between refills and gallons of gas
 * added when the tank is refilled. The program calculates the miles per gallon (MPG) for 
 * the refill and the overall (trip) miles per gallon for each set of entries. 
 */

import java.util.Scanner;

public class GasMileage 
{
  public static void main(String[] args)
  {
  int miles = 0;
  int gallons = 0;
  int totalMiles = 0;
  int totalGallons = 0;
  double milesPerGallon = 0.0;
  double totalMilesPerGallon = 0.0;
  
  Scanner input = new Scanner(System.in);
  
    System.out.printf("%nEnter miles traveled or enter -1 to quit: ");
    miles = input.nextInt();
    
    while (miles > -1)
    {
    input.nextLine();
    
    System.out.printf("%nEnter gallons for this tank refill:  ");
    gallons = input.nextInt();
    totalMiles += miles;
    totalGallons += gallons;
    
    if(gallons > 0)
    {
    milesPerGallon = (double)miles/gallons;
    System.out.printf("%nMPG for this tankful: %.2f", milesPerGallon);
    }//END if gallons > 0
    
    if(totalGallons > 0)
    {
    totalMilesPerGallon = ((double)totalMiles / totalGallons);
    System.out.printf("%nTrip MPG: %.2f%n", totalMilesPerGallon);  
    }//END totalGallons >0
    
    System.out.printf("%nEnter miles traveled or enter -1 to quit:  ");
    miles = input.nextInt();
    
    }//END while miles != -1
    System.exit(0);
  }//END main()
} //END PUBLIC CLASS GasMileage
    
 
  