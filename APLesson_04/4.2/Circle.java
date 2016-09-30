import java.util.Scanner;

public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter radius:");
		r = kb.nextDouble();
		
		calcArea();
		
		print();
	}
	
	public static void calcArea()
	{
		area =  Math.PI * Math.pow(r, 2);
	}

	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %.5f is %.5f.", r, area);
	}
}