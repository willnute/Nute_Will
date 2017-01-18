import java.util.Random;
public class User
{
	private String firstName, lastName, avatar;
	private int userID;
	
	public User()
	{
		firstName = "First Name";
		lastName = "Last Name";
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void modifyInfo(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName + 
		"\nLast Name: " + lastName +
		"\nAvatar: " + avatar +
        "\nUser ID#: " + userID;
	}
}