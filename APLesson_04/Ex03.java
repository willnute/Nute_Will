import java.util.Math;
import java.util.Scanner;

public class Ex04
{
	public static void main(String[]args0)
	{
		Ex04 Loan1 = new Ex04();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your principal:");
		double principal = kb.nextDouble();
		
		System.out.println("Please enter your interest rate:");
		double rate = kb.nextDouble();
		
		System.out.println("Please enter the number of times per year interest is compounded:");
		double compounding = kb.nextDouble();
		
		System.out.println("Please enter the life of the loan (in years):");
		double life = kb.nextDouble();
		
		System.out.printf("Your total monthly payment is $%.2f.%n", Loan1.monthlyPayment(principal, rate, compounding, life));
		System.out.printf("Your total cost for the loan is $.2f.", Loan1.totalCost(principal, rate, compounding, life));
	}
	
	public double monthlyPayment(double p, double r, double n, double t)
	{
		return p*Math.pow(1+r/n,n*t);
	}
	
	public double totalCost(double p, double r, double n, double t)
	{
		return p*Math.pow(1+r/n,n*t);
	}
}