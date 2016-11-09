import java.util.Scanner;
public class Ex_04
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = kb.nextLine();
		
		int start = 0;
		int stop = word.length();
		
		tree(word, start, stop);
	}
	
	public static String tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%10s%n",word.substring(0,start));
			start += 1;
			return tree(word, start, stop);
		}
		else 
			return "";
	}
}