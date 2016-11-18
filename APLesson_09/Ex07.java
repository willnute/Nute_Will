import java.util.Scanner;
public class Ex07
{
	static String[] words;
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		for(String c : words)
			c = safeString(c); //just in case
		System.out.println("All your strings are safe!");
		
		System.out.print("For the words "); printArray();
		System.out.println();
		System.out.printf("The words " + hasZs() + "contain the letter z.");
		
	}
	
	public static void fillArray()
	{
		System.out.println("Please enter 5 words:");
		for (int i = 0; i < words.length; i++)
			words[i] = kb.next();
	}
	
	public static void printArray()
	{
		for(String c : words){
			//if(c != (words[(words.length)-2]||words[(words.length)-1]))
			//	System.out.print(c+", ");
			//else if(c == words[words.length]-2])
			//	System.out.print(c+", and "); //oxford comma for life
			//else if(c == words[words.length]-1)
			//	System.out.print(c+".");
			System.out.print(c+", ");
		}
	}
	
	public static String hasZs()
	{
		String zs = " ";
		for(String c : words){
			if(c.indexOf("z") >= 0)
				zs += c + " ";
		}
		
		return zs;
	}
	
	public static String safeString(String string) //you can thank evan for showing me this
	{
		if(string != null)
			return string;
		else
			return null;
	}
	
}