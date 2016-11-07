import java.util.Scanner;
public class Ex_04
{
	static String sentence;
	static int top;
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		sentence = kb.nextLine();
		
		replace(sentence);
		
		System.out.println(sentence);
	}
	
	public static void replace(String sen)
	{
		while(sen.indexOf("a") >= 0){
			sen = sen.substring(0,sen.indexOf("a")) + "@"+ sen.substring(sen.indexOf("a")+1);
		}
		while(sen.indexOf("A") >= 0){
			sen = sen.substring(0,sen.indexOf("A")) + "@"+ sen.substring(sen.indexOf("A")+1);
		}
		sentence = sen;
	}
}