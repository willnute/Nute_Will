import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter side length:");
		side = kb.nextDouble();
		
		
		
		print();
	}
	
	public static double calcSurf()
	{
		return 6 * side * side;
	}

	public static void print()
	{
		System.out.printf("The surface area of a cube with %.5f\" sides is %.5f", side, calcSurf());
	}
}