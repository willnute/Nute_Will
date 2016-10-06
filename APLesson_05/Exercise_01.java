import java.util.Random;

public class Exercise_01
{
	public static void main(String[]args)
	{
		Random rng = new Random();
		
		int playerRoll = rng.nextInt(6) + 1;
		int compRoll = rng.nextInt(6) + 1;
		
		String winner = rollDice(playerRoll, compRoll);
		
		System.out.printf("You rolled a %d.%n", playerRoll);
		System.out.printf("Computer rolled a %d.%n", compRoll);
		System.out.printf("The winner is %s.", winner);
	}
	
	public static String rollDice(int player, int comp)
	{
		if(player>comp)
			return "you";
			
		if(comp>player)
			return "computer";
		
		return "both of you";
	}
}