import java.util.Random;

public class Ex_01
{
	public static void main(String[] args)
	{
		Random rng = new Random();
		int[][]nums = new int[4][4];
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++)
				nums[i][j] = rng.nextInt(100);
		}
		
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[i].length; j++)
				System.out.print(nums[i][j]+" ");
			System.out.println();
		}
	}
}