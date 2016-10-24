public class Ex_08
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String lyric, int repeatNum)
	{
		for(int i = 1; i <= repeatNum; i++)
			System.out.printf(lyric+" ");
		System.out.printf("%n");
	}
}