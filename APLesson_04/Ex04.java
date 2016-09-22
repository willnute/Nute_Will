import java.util.Scanner;

public class Ex04
{
	public static void main(String[]args)
	{
		Ex04 box = new Ex04();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the height in inches:");
		double height = kb.nextDouble();
		
		System.out.println("Please enter the length in inches:");
		double length = kb.nextDouble();
		
		System.out.println("Please enter the width in inches:");
		double width = kb.nextDouble();
		
		System.out.printf("The volume of your box in feet is %.4f", box.calcVol(height, length, width));
	}
	
	public double calcVol(double h, double l, double w)
	{
		return h*l*w / Math.pow(12,3);
	}
}