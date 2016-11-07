import java.util.Scanner;
public class Ex_02
{
	static double sum = 0;
	static double digits = 0;
	static double average;
	static int num;
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		num = kb.nextInt();
		
		avDigits(num);
		
		System.out.printf("The average of the digits in %d is %.2f.", num, average);
	}
	
	public static void avDigits(int number)
	{
		while(number > 0){
			digits += 1;
			sum += number % 10;
			number /= 10;
		}
		average = sum / digits;
	}
}