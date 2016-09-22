import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello. This is a bitwise XOR calculator.");
		System.out.println("Please enter your first number.");
		int num1 = keyboard.nextInt();
		System.out.println("Please enter your second number.");
		int num2 = keyboard.nextInt();
		System.out.println("The result of your XOR operation is...");
		int result = num1 ^ num2;
		System.out.println(result);
	}
}