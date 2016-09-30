import java.util.Scanner;

public class Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter radius:");
		double radius = kb.nextDouble();
		
		print(radius, calcArea(radius));
	}
	
	public static double calcArea(double r)
	{
		return Math.PI * Math.pow(r, 2);
	}

	public static void print(double r, double a)
	{
		System.out.printf("The area of a circle with a radius of %.5f is %.5f.", r, a);
	}
}