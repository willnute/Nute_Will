import java.util.Scanner;
public class CarRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your desired paint color:");
		String paint = kb.nextLine();
		System.out.println("Please enter your desired interior design:");
		String interior = kb.nextLine();
		System.out.println("Please enter your desired engine:");
		String engine = kb.nextLine();
		System.out.println("Please enter your desired tires:");
		String tires = kb.nextLine();
		
		Car myCar = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready......");
		System.out.printf("Paint:%28s%n", myCar.getPaint());
		System.out.printf("Interior:%25s%n", myCar.getInterior());
		System.out.printf("Engine:%27s%n", myCar.getEngine());
		System.out.printf("Tires:%28s", myCar.getTires());
	}
}