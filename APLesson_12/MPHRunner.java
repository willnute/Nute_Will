import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your distance:");
		int distance = kb.nextInt();
		System.out.println("Please enter your hours:");
		int hours = kb.nextInt();
		System.out.println("Please enter your minutes:");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		System.out.printf("%d miles in %d hours and %d minutes = %.2f miles per hour%n", object.getDistance(), object.getHours(), object.getMinutes(), object.getMPH());
		
		object.setValues(100, 2, 5);
		System.out.printf("%d miles in %d hours and %d minutes = %.2f miles per hour", object.getDistance(), object.getHours(), object.getMinutes(), object.getMPH());
	}
}