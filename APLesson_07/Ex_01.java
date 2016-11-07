import java.util.Scanner;
public class Ex_01
{
	static int sum = 0;
	static int num;
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		num = kb.nextInt();
		
		sumDigits(num);
		
		System.out.printf("The sum of the digits in %d is %d.", num, sum);
	}
	
	public static void sumDigits(int number)
	{
		while(number > 0){
			sum += number % 10;
			number /= 10;
		}
	}
}