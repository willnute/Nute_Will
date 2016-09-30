import java.util.Scanner;

public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter side length:");
		double side = kb.nextDouble();
		
		print(side, calcSurf(side));
	}
	
	public static double calcSurf(double s)
	{
		return 6 * s * s;
	}

	public static void print(double s, double sa)
	{
		System.out.printf("The surface area of a cube with %.5f\" sides is %.5f", s,sa);
	}
}