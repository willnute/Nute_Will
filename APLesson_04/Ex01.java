import java.util.Scanner;

public class Ex01
{
	public static void main(String[]args)
	{
		Ex01 receipt = new Ex01();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double item1_price = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double item2_price = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double item3_price = kb.nextDouble();
		
		double subtotal = item1_price + item2_price + item3_price;
		double tax = 0.08 * subtotal;
		double total = subtotal + tax;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		receipt.format(item1, item1_price);
		receipt.format(item2, item2_price);
		receipt.format(item3, item3_price);
		System.out.println();
		receipt.format("Subtotal:", subtotal);
		receipt.format("Tax:", tax);
		receipt.format("Total:", total);
		System.out.println("__________________________________________");
		System.out.println(" * Thank you for your support *");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("*%17s ........%10.2f%n", item, price);
	}
}