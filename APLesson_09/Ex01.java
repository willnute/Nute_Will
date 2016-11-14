import java.util.Scanner;
public class Ex01
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Please enter 5 words:");
		for (int i = 0; i < words.length; i++)
			words[i] = kb.next();
		
		System.out.println("In order...");
		for (String word : words)
			System.out.println(word);
		
		System.out.println("Reversed...");
		for (String word : words)
			System.out.println(reverse(word));
	}
	
	public static String reverse(String w)
	{
		String rev = "";
		for (int i = 1; i <= w.length(); i++)
			rev += w.charAt(w.length() - i);
		return rev;
	}
}