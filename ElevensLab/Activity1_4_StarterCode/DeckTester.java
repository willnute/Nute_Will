/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String ranks1[] = new String[13];
		for(int i = 0; i<9; i++){
				ranks1[i] = i + 2 + "";
		}
		ranks1[9] = "Jack";
		ranks1[10] = "Queen";
		ranks1[11] = "King";
		ranks1[12] = "Ace";
		String suits1[] = new String[4];
		suits1[0] = "spades";
		suits1[1] = "clubs";
		suits1[2] = "hearts";
		suits1[3] = "diamonds";
		int values1[] = new int[13];
		for(int i = 0; i<values1.length; i++){
			values1[i] = i+1;
		}
		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println(deck1.size());
	}
}
