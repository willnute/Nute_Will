import java.util.Scanner;
public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Will you be entering price and category info? (y or n)");
		String choice = kb.nextLine();
		
		if(choice.equals("y")){
			System.out.println("Please enter item name:");
			String name = kb.nextLine();
			System.out.println("Please enter item manufacturer:");
			String manufacturer = kb.nextLine();
			System.out.println("Please enter item category:");
			String category = kb.nextLine();
			System.out.println("Please enter item price:");
			double price = kb.nextDouble();
			Inventory item1 = new Inventory(name, manufacturer, category, price);
			System.out.println(item1);
		}
		else if(choice.equals("n")){
			System.out.println("Please enter item name:");
			String name = kb.nextLine();
			System.out.println("Please enter item manufacturer:");
			String manufacturer = kb.nextLine();
			Inventory item1 = new Inventory(name, manufacturer);
			System.out.println(item1);
		}
	}
}