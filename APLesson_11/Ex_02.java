import java.util.Scanner;

public class Ex_02
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String[][]words = new String[4][4];
		for(int i = 0; i < words.length; i++){
			for(int j = 0; j < words[i].length; j++){
				System.out.println("Please enter a word:");
				words[i][j] = kb.nextLine();
			}
		}
		
		
		for(int i = 0; i < words.length; i++){
			for(int j = 0; j < words[i].length; j++)
				System.out.print(words[i][j]+" ");
			System.out.println();
		}
	}
}