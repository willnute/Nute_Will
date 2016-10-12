import java.util.Scanner;
public class Ex04
{
	static double bmi = 0;
	static String condition = "";
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches:");
		double height = kb.nextDouble();
		System.out.println("Please enter your weight in pounds:");
		double weight = kb.nextDouble();
		
		calcBMI(height, weight);
		
		System.out.printf("Your BMI is: %.3f.%n", bmi);
		System.out.printf("You are %s.", condition);
	}
	public static void calcBMI(double h, double w)
	{
		bmi = (w * 703)/Math.pow(h, 2);
		if(bmi>=40)
			condition = "Morbidly Obese";
		else if(bmi>=35)
			condition = "Very Obese";
		else if(bmi>=30)
			condition = "Obese";
		else if(bmi>=25)
			condition = "Overweight";
		else if(bmi>=18.5)
			condition = "Normal";
		else
			condition = "Underweight";
	}
}