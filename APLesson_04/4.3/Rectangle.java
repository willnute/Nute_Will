import java.util.Scanner;

public class Rectangle
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter length:");
		double length = kb.nextDouble();
		
		System.out.println("Please enter width:");
		double width = kb.nextDouble();
		
		print(calcPerim(length, width));
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2 * (l + w);
	}

	public static void print(double perim)
	{
		System.out.printf("Your rectangle is %.5f ft around.", perim);
	}
}