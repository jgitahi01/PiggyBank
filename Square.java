/* Name; John Gitahi
    SMU; 48116033
	Lab 2 Fall-2019
*/	
//pre lab
import java.util.Scanner;

public class Square

{
	public static void main (String[]args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int Length= input.nextInt();
		System.out.printf("The length of the square is %d \n", Length);
		
		int Area=Length*Length;
		System.out.printf("The area of the square is %d \n", Area);
		
					
	}// end main
	

}//end class