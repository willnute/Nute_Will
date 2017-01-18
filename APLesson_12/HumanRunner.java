import java.util.Scanner;
public class HumanRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your hair color:");
		String hair = kb.nextLine();
		System.out.println("Please enter your eye color:");
		String eyes = kb.nextLine();
		System.out.println("Please enter your skin color:");
		String skin = kb.nextLine();
		
		Human me = new Human(hair, eyes, skin);
		System.out.println("My info...");
		System.out.printf("Hair: %s%n", me.getHair());
		System.out.printf("Eyes: %s%n", me.getEyes());
		System.out.printf("Skin: %s%n", me.getSkin());
		
		me.setHES("black", "black", "dark");
		System.out.println("Friend's info...");
		System.out.printf("Hair: %s%n", me.getHair());
		System.out.printf("Eyes: %s%n", me.getEyes());
		System.out.printf("Skin: %s%n", me.getSkin());
	}
}