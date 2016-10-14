import java.util.Scanner;

public class Ex06
{
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		String realUser = "willnute";
		String realPass = "314159265";
		
		passCheck(realUser, realPass);
	}
	
	public static void passCheck(String user, String pass)
	{
		System.out.println("Please enter your username:");
		String tempUser = kb.nextLine();
		
		System.out.println("Please enter your password:");
		String tempPass = kb.nextLine();
		
		if(tempUser.equals(user)&&tempPass.equals(pass))
			System.out.println("You are granted access!");
		else{
			if(tempUser.equals(user)){
				System.out.println("Your password is incorrect!");
				passCheck(user, pass);
			}
			else if(tempPass.equals(pass)){
				System.out.println("Your username is incorrect!");
				passCheck(user, pass);
			}
			else{
				System.out.println("Your username and password are incorrect!");
				passCheck(user, pass);
			}
		}
	}
}