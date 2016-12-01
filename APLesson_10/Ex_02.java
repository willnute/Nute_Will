import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_02
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation:");
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(kb.nextLine().split(" ")));
		
		System.out.println(doEquation(equation).get(0));
	}
	
	public static ArrayList doEquation(ArrayList<String> eqn)
	{
		int i = 0;
		while(i < eqn.size())
		{
			if(eqn.get(i).equals("*") || eqn.get(i).equals("/"))
			{
				if(eqn.get(i).equals("*"))
					eqn.set(i, Integer.toString(Integer.parseInt(eqn.get(i-1))*Integer.parseInt(eqn.get(i+1))));
				else
					eqn.set(i, Integer.toString(Integer.parseInt(eqn.get(i-1))/Integer.parseInt(eqn.get(i+1))));
				eqn.remove(i-1);
				eqn.remove(i);
			}
			i++;
		}
		i = 0;
		while(i < eqn.size())
		{
			if(eqn.get(i).equals("+") || eqn.get(i).equals("-"))
			{
				if(eqn.get(i).equals("+"))
					eqn.set(i, Integer.toString(Integer.parseInt(eqn.get(i-1))+Integer.parseInt(eqn.get(i+1))));
				else
					eqn.set(i, Integer.toString(Integer.parseInt(eqn.get(i-1))-Integer.parseInt(eqn.get(i+1))));
				eqn.remove(i-1);
				eqn.remove(i);
			}
			i++;
		}
		return eqn;
	}
}