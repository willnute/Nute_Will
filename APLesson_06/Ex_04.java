import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		int coefficient = kb.nextInt();
		
		System.out.println("How many rows?");
		int tableSize = kb.nextInt();
		

		System.out.printf("__x__|__y__%n");
		for(int i = 1; i <= tableSize; i++)
			format(i, coefficient * i);
	}
	
	public static void format(int one, int two)
	{
		System.out.printf("%4d |%4d %n", one, two);
	}
}