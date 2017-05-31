/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 8;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3, 4, 5, 6, 7};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3, 4, 5, 6, 7};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
		
		flip();flip();flip();flip();flip();flip();flip();flip();flip();

		int[] test1 = {1,5,3,6,11,10};
		int[] test2 = {1,3,5,11,10,7};
		System.out.println(arePermutations(test1, test2));
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		int[] shuffled = new int[values.length];
		int k = 0;
		for(int j = 0; j < values.length/2; j++){
			shuffled[k] = values[j];
			k += 2;
		}
		k = 1;
		for(int j = values.length/2; j < values.length; j++){
			shuffled[k] = values[j];
			k += 2;
		}
		for(int i = 0; i < values.length; i++)
			values[i] = shuffled[i];
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		int holdVal;
		for(int k = values.length-1; k>0; k--){
			int r = ((int) (Math.random() * k));
			holdVal = values[k];
			values[k] = values[r];
			values[r] = holdVal;
		}
	}
	
	public static void flip(){
		int i = ((int)(Math.random()*3));
		if(i<2)
			System.out.println("Heads");
		else
			System.out.println("Tails");
	}
	
	public static boolean arePermutations(int[] arr1, int[] arr2){
		boolean perm = true;
		for(int i = 0; i < arr1.length; i++)
		{
			for(int k = 0; k < arr2.length; k++)
			{
				if(arr1[i]==arr2[k])
				{
					arr1[i]=Integer.MIN_VALUE;
					arr2[k]=Integer.MIN_VALUE;
				}
			}
		}
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr1[i]!=Integer.MIN_VALUE)
			{
				perm = false;
			}
		}
		return perm;
	}
}
