public class ToyRunner
{
	public static void main(String args[])
	{
		AFigure superman = new AFigure("Super Man");
		Car ferrari = new Car("Ferrari");
		
		System.out.println(superman);
		System.out.println(ferrari);
		
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println("Inventory: "+store);
		
		System.out.println("Most Frequent Toy: " + store.getMostFrequentToy());
		System.out.println("Most Frequent Type: " + store.getMostFrequentType());
	}
}