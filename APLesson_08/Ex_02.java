import java.util.Scanner;
public class Ex_02
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 3 words (enter in between each):");
		String word1 = kb.nextLine();
		String word2 = kb.nextLine();
		String word3 = kb.nextLine();
		
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	
	public static String makeCenter(String word)
	{
		if(word.length()>=20) return word;
		return makeCenter(" " + word + " ");
	}
}