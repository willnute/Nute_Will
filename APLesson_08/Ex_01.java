import java.util.Scanner;
public class Ex_01
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String sentence = kb.nextLine();
		
		System.out.println(replace(sentence));
	}
	
	public static String replace(String sen)
	{
		if(sen.indexOf(" ") == -1) return sen;
		return replace(sen.substring(0,sen.indexOf(" ")) + "_"+ sen.substring(sen.indexOf(" ")+1));
	}
}