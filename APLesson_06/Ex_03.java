import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a string:");
		String word = kb.next();
		
		for(int i = word.length() - 1; i >= 0; i--)
			System.out.println(word.substring(0,i));
	}
}