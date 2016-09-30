import java.util.Scanner;

public class Rectangle
{
	static double length;
	static double width;
	static double perim;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter length:");
		length = kb.nextDouble();
		
		System.out.println("Please enter width:");
		width = kb.nextDouble();
		
		calcPerim();
		
		print();
	}
	
	public static void calcPerim()
	{
		perim = 2 * (length + width);
	}

	public static void print()
	{
		System.out.printf("Your rectangle is %.5f sq ft around.", perim);
	}
}