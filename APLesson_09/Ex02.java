import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Please enter 5 words:");
		for (int i = 0; i < words.length; i++)
			words[i] = kb.next();
		first(words);
	}
	
	public static void first(String[] w)
	{
		for (String s : w)
			System.out.println(s.charAt(0));
	}
}