import java.util.Scanner;
public class Ex03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your math grade:");
		String math = kb.nextLine();
		System.out.println("Please enter your biology grade:");
		String biology = kb.nextLine();
		System.out.println("Please enter your English grade:");
		String english = kb.nextLine();
		System.out.println("Please enter your history grade:");
		String history = kb.nextLine();
		System.out.println("Please enter your physics grade:");
		String physics = kb.nextLine();
		System.out.println("Please enter your computer science grade:");
		String compsci = kb.nextLine();
		System.out.println("Please enter your elective grade:");
		String elective = kb.nextLine();
		
		double gPoints = calcPoints(math) + calcPoints(biology) + calcPoints(english) + calcPoints(history) + calcPoints(physics) + calcPoints(compsci) + calcPoints(elective);
		double GPA = gPoints/7;
		
		System.out.printf("Your GPA is %.2f.", GPA);
	}
	public static double calcPoints(String g)
	{
		if(g.equals("A"))
			return 4.0;
		else if(g.equals("B"))
			return 3.0;
		else if(g.equals("C"))
			return 2.0;
		else if(g.equals("D"))
			return 1.0;
		else return 0.0;
	}
}