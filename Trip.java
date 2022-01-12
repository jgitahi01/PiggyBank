/* Name; John Gitahi
    SMU; 48116033
	Lab 2 Fall-2019
*/	

import java.util.Scanner;//progrm uses class scanner

public class Trip

{
	//main method begins execution of Java Application
	public static void main (String[]args)
	
	{
		Scanner input = new Scanner (System.in);//create scanner to obtain input from command
		

		double start;
		double end;
		double duration;
		double fuel;
       double mile_driven;
	   double  average_speed;
	   double fuel_efficiency;
	   
	   
	   
		System.out.print("Enter Odometer start reading:");
		start= input.nextDouble();//read start input from user
		
		System.out.print("Enter Odometer end reading:");
		end= input.nextDouble();//read end reading from user
		
		System.out.print("Enter Trip Duration(hours):");
		duration= input.nextDouble(); // read duration entered by user
		
		System.out.print("Enter fuel purchased (gallons):");
		fuel= input.nextDouble(); // read fuel purchased by user
		
	   mile_driven = end-start;
       average_speed = mile_driven/duration;
       fuel_efficiency = mile_driven/fuel;
	   // calculate mile_driven, average_speed and fuel_efficiency from user input
		
	  System.out.printf(" Miles Driven: %.1f\n", mile_driven);
	  System.out.printf(" Averge Speed: %.1f MPH\n", average_speed);
	  System.out.printf(" Fuel Efficincy: %.1f MPG\n", fuel_efficiency);
	  
	  
	  
		
	}// end of main
	
	
	
}//end of class Trip


