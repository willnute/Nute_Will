import java.util.Scanner;
public class Ex_03
{
	static int rev = 0;
	static int num;
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		num = kb.nextInt();
		
		getReverse(num);
		
		System.out.printf("%d reversed is %d.", num, rev);
	}
	
	public static void getReverse(int number)
	{
		while(number > 0){
			rev *= 10;
			rev += number % 10;
			number /= 10;
		}
	}
}