import java.util.Arrays;
import java.util.ArrayList;

public class Ex_01
{
	public static void main(String[] args)
	{
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		System.out.println(removePrimes(nums));
	}
	
	public static boolean isPrime(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static ArrayList removePrimes(ArrayList<Integer> numlist)
	{
		for(int i = 0; i < numlist.size(); i++){
			if(isPrime(numlist.get(i))){
				numlist.remove(i);
				i -= 1;
			}
		}
		
		return numlist;
	}
}