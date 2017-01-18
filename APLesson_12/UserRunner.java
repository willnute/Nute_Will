import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String firstName = kb.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = kb.nextLine();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String choice = kb.nextLine();
		
		if(choice.equals("y")){
			System.out.println("Please enter your avatar:");
			String avatar = kb.nextLine();
			User user1 = new User(firstName, lastName, avatar);
			System.out.println(user1);
		}
		else if(choice.equals("n")){
			User user1 = new User(firstName, lastName);
			System.out.println(user1);
		}
		
		
	}
}