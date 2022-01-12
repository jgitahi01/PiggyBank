/* Name; John Gitahi
    SMU; 48116033
	Lab 2 Fall-2019
*/	

import java.util.Scanner;// program uses class scanner


public class PiggyBank
{
   public static void main(String[] args) 
   
   {
   Scanner in=new Scanner(System.in);
   //creates scanner to obtain input from user
   System.out.print("Welcome to the Piggy Bank. Please enter staring balance: $");
   double balance=in.nextDouble();//read balance input from user
   int choice=0;
   
   
   //while statement
   while(choice!=3)
   
   {
   System.out.println("\nPiggy Bank Atm");
   System.out.printf("Balance: $%.2f\n\n",balance);
   System.out.println("OPTIONS\n");
   System.out.println("1. Deposit\n2. Withdraw\n3. Quit\n");
   System.out.print("Choice one: ");
   choice=in.nextInt();//read input from user
   
   //if statement
   if(choice==1)
   {
   System.out.print("Enter deposit amount: $");
   double deposit=in.nextDouble();//read deposit input from user
   balance=balance+deposit;//sum
   }
   
   
   else if(choice==2)
   {
   System.out.print("Enter withdraw amount: $");
   double withdraw=in.nextDouble();//read withdraw input from user
   balance=balance-withdraw;//subtract
   
   }
   
   else
   
   {
   System.out.printf("Ending Balance: $%.2f",balance);
   
   
   
   }
   
   }
   
   }//end main
   
}//end class PiggyBank


