import java.util.Scanner;

public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your largest number:");
		int lastNum = kb.nextInt();
		
		System.out.println("Please enter the number you are counting by:");
		int stepNum = kb.nextInt();
		
		for(int i = stepNum; i<= lastNum; i+=stepNum)
			System.out.printf("%d\t", i);
	}
}