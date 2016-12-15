import java.util.Random;

public class Ex_03
{
	public static void main(String[] args)
	{
		Random rng = new Random();
		String[][]xAndO = new String[4][4];
		for(int i = 0; i < xAndO.length; i++){
			for(int j = 0; j < xAndO[i].length; j++){
				int pick = rng.nextInt(2);
				if(pick == 0)
					xAndO[i][j] = "x";
				if(pick == 1)
					xAndO[i][j] = "o";
				System.out.print(xAndO[i][j] + "\t");
			}
			System.out.println();
		}
	}
}