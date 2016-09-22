import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello, I go by RudeAI.");
		System.out.println("Let's see if you have enough brain cells to answer these questions.");
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println("Really? " + name + "? It says THAT on your birth certificate?");
		System.out.println("Speaking of which, how old are you, " + name + "?");
		int age = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Ooh, um... let's just say those " + age +" years have not been good to you.");
		System.out.println("What do you do for fun? I mean, if you are capable of having any.");
		String fun = keyboard.nextLine();
		System.out.println("Honestly, I'd rather watch paint dry than " + fun + ".");
		System.out.println("What type of music do you enjoy listening to?");
		String music = keyboard.nextLine();
		System.out.println("People still make " + music + " music? I'm surprised.");
		System.out.println("How many siblings do you have? I hope your parents aren't stuck with just you.");
		int siblings = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("My creator hasn't endowed me with if statements yet, so I'm just hoping " + siblings + " wasn't 0.");
		System.out.println("And when you grow up? What do you want to do?");
		String career = keyboard.nextLine();
		System.out.println("A " + career + "? Well, we all have our dreams.");
		System.out.println("So, your name is " + name + " and you are " + age + " years old...");
		System.out.println("You like to " + fun + " and listen to " + music + "...");
		System.out.println("And you want to be a " + career + ". Good luck with that.");
		System.out.println("RudeAI is not kidding. RudeAI has no heart.");
	}
}