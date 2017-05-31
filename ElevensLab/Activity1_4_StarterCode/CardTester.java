/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card eightofspades = new Card("8", "spades", 13);
		Card sixofclubs = new Card("6", "clubs", 2);
		Card eightofspades2 = new Card("8", "spades", 13);
		
		System.out.println(eightofspades.rank());
		System.out.println(eightofspades.suit());
		System.out.println(eightofspades.pointValue());
		if (eightofspades.matches(eightofspades2))
			System.out.println("Cards match!");
		System.out.println(sixofclubs);
	}
}
