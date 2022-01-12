import java.util.Scanner;
public class Budget
{
   public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Java Budget");
       System.out.print("Enter the annual Income:");
       int annualIncome =s.nextInt();
       float monthlyIncome = annualIncome/12;
       float Rentmortgage = monthlyIncome*23/100;
       float IncomeTax = monthlyIncome*20/100;
       float utilities = monthlyIncome*10/100;
       float FoodMedicine = monthlyIncome*10/100;
       float carExpense = monthlyIncome*8/100;
       float Insurance = monthlyIncome*5/100;
       float Recreation = monthlyIncome*6/100;
       float Savings = monthlyIncome*8/100;
       float DiningOut = monthlyIncome*5/100;
       float Charity = monthlyIncome*5/100;
       System.out.println("Monthly Income $ "+monthlyIncome);
       System.out.println("Rent/Mortage $ "+Rentmortgage);
       System.out.println("Income Tax $ "+IncomeTax);
       System.out.println("Utilities $ "+utilities);
       System.out.println("Food/Medicine $ "+FoodMedicine);
       System.out.println("Car Expenses $ "+Recreation);
       System.out.println("Insurance $ "+Insurance);
       System.out.println("Recreation $ "+Recreation);
       System.out.println("Savings $ "+Savings);
       System.out.println("Dining Out $ "+DiningOut);
       System.out.println("Charity $ "+Charity);
   }
}

