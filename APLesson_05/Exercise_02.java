import java.util.Scanner;

public class Exercise_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please input Item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please input the price:");
		double item1Price = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please input Item 2:");
		String item2 = kb.nextLine();
		System.out.println("Please input the price:");
		double item2Price = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please input Item 3:");
		String item3 = kb.nextLine();
		System.out.println("Please input the price:");
		double item3Price = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please input Item 4:");
		String item4 = kb.nextLine();
		System.out.println("Please input the price:");
		double item4Price = kb.nextDouble();
		
		double subtotal = item1Price + item2Price + item3Price + item4Price;
		double dis = discount(subtotal);
		double tax = .075 * subtotal;
		double total = subtotal + tax - dis;
		
		System.out.println("<<<<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		format(item1, item1Price);
		format(item2, item2Price);
		format(item3, item3Price);
		format(item4, item4Price);
		format("Subtotal:", subtotal);
		format("Discount:", dis);
		format("Tax:", tax);
		System.out.println("*");
		format("Total:", total);
		System.out.println("_____________________________________");
		System.out.println("Thank you!");
		
		
	}
	
	public static double discount(double sub)
	{
		if(sub>=2000)
			return .15*sub;
		
		return 0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("*%17s ........%10.2f%n", item, price);
	}
}