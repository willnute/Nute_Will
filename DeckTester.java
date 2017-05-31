/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String ranks1[] = new String[2];
		ranks1[0] = "1";
		ranks1[1] = "2";
		String ranks2[] = new String[5];
		for (int i = 0; i < 4; i++)
		{
			ranks2[i] = i + 1 + "";
		}
		String ranks3[] = new String[4];
		ranks3[0] = "Jack";
		ranks3[1] = "Queen";
		ranks3[2] = "King";
		ranks3[3] = "Ace";

		String suits1[] = new String[2];
		suits1[0] = "hearts";
		suits1[1] = "spades";
		String suits2[] = new String[4];
		suits2[0] = "apples";
		suits2[1] = "oranges";
		suits2[2] = "cherries";
		suits2[3] = "grapes";
		String suits3[] = new String[4];
		suits3[0] = "spades";
		suits3[1] = "clubs";
		suits3[2] = "hearts";
		suits3[3] = "diamonds";

		int values1[] = new int[2];
		values1[0] = 1;
		values1[1] = 2;
		int values2[] = new int[5];
		for (int i = 0; i < 4; i++)
		{
			values2[i] = i + 1;
		}
		int values3[] = new int[4];
		values3[0] = 10;
		values3[1] = 10;
		values3[2] = 10;
		values3[3] = 10;

		Deck deck1 = new Deck(ranks1, suits1, values1);
		Deck deck2 = new Deck(ranks2, suits2, values2);
		Deck deck3 = new Deck(ranks3, suits3, values3);
		System.out.println(deck1.size()+", "+deck2.size()+", "+deck3.size());
		System.out.println(deck1.deal()+"\n"+deck2.deal()+"\n"+deck3.deal());
		System.out.println(deck1.size()+", "+deck2.size()+", "+deck3.size());

		/*Activity 4*/
		String ranksfull[] = new String[13];
		for(int i = 0; i<9; i++){
				ranksfull[i] = i + 2 + "";
		}
		ranksfull[9] = "Jack";
		ranksfull[10] = "Queen";
		ranksfull[11] = "King";
		ranksfull[12] = "Ace";
		String suitsfull[] = new String[4];
		suitsfull[0] = "spades";
		suitsfull[1] = "clubs";
		suitsfull[2] = "hearts";
		suitsfull[3] = "diamonds";
		int valuesfull[] = new int[13];
		for(int i = 0; i<valuesfull.length; i++){
			valuesfull[i] = i+1;
		}
		Deck deckfull = new Deck(ranksfull, suitsfull, valuesfull);
		System.out.println(deckfull);
	}
}
