import java.util.Scanner;

public class Ex05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You wake up and find yourself in a dark room.");
		System.out.println("Do you go through the left or right door?");
		String doorChoice = kb.nextLine();
		
		if(doorChoice.equals("left"))
		{
			System.out.println("There's a large pit of lava in the middle of the room.");
			System.out.println("Do you try to jump it, or shimmey across a ledge?");
			String pitChoice = kb.nextLine();
			if(pitChoice.equals("shimmey"))
			{
				System.out.println("After a few steps the ledge begins to crack and break.");
				System.out.println("Do you run across or try to turn back?");
				String ledgeChoice = kb.nextLine();
				if(ledgeChoice.equals("run across"))
				{
					System.out.println("You trip and fall while running, plummeting into the lava.");
					death();
				}
				else if(ledgeChoice.equals("turn back"))
				{
					System.out.println("You make it a couple feet back before the ledge gives out and you fall to your death.");
					death();
				}
				else
					error();
			}
			else if(pitChoice.equals("jump"))
			{
				System.out.println("You leap gracefully across the pit, landing safely on the other side.");
				System.out.println("There's a door in front of you. Do you open it or shout \"Open Sesame!\"?");
				String treasureChoice = kb.nextLine();
				if(treasureChoice.equals("open it"))
				{
					System.out.println("A large anvil drops from above and crushes you as you touch the handle.");
					death();
				}
				else if(treasureChoice.equals("shout \"Open Sesame!\""))
				{
					System.out.println("The door opens and reveals a room of treasure!");
					System.out.println("Congratulations! A winner is you!");
				}
				else
					error();
			}
			else
				error();
		}
		else if(doorChoice.equals("right"))
		{
			System.out.println("There's a large minotaur in the small room, sitting on a stool.");
			System.out.println("Do you say hi, or prepare to battle and draw your sword?");
			String minotaurChoice = kb.nextLine();
			if(minotaurChoice.equals("say hi"))
			{
				System.out.println("The minotaur waves back at you, smiling.");
				System.out.println("Do you shake his hand or ask him for treasure?");
				String socialChoice = kb.nextLine();
				if(socialChoice.equals("shake his hand"))
				{
					System.out.println("The beast's crushing grip breaks your hand and you die of internal bleeding.");
					death();
				}
				else if(socialChoice.equals("ask him for treasure"))
				{
					System.out.println("He frowns as he winds up his arm and punches you in the face, instantly killing you.");
					death();
				}
				else
					error();
			}
			else if(minotaurChoice.equals("draw sword"))
			{
				System.out.println("The minotaur stands up and lifts the stool over his head, preparing to smash you.");
				System.out.println("Do you dodge out of the way, or try to stab him first?");
				String combatChoice = kb.nextLine();
				if(combatChoice.equals("dodge"))
				{
					System.out.println("You expertly roll to the left, but the minotaur just turns and hits you anyway.");
					death();
				}
				else if(combatChoice.equals("stab"))
				{
					System.out.println("Your sword clangs against his skin, barely scratching him. The stool comes crashing down on your head.");
					death();
				}
				else
					error();
			}
			else
				error();
		}
		else
			error();	
	}	
	
	public static void death()
	{
		System.out.println("GAME OVER. Try again!");
	}
	
	public static void error()
	{
		System.out.println("Error. Invalid string entered. Restart and try again.");
	}
}