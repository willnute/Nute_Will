import java.util.Random;
public class Ex03
{
	public static void main(String[] args)
	{
		Random rng = new Random();
		
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = rng.nextInt(100);
		System.out.println("Numbers...");
		for (int i : numbers)
			System.out.print(i + " ");
		System.out.println();
		System.out.printf("The average of the above numbers is %.1f.", average(numbers));
	}
	
	public static float average(int[] n)
	{
		float sum = 0;
		for(int i : n)
			sum += i;
		return sum/((float) n.length);
	}
}