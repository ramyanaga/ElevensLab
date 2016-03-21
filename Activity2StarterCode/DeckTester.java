/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"Ace","King","Queen","Jack","10","9"};
		String [] suits1 = {"Hearts", "Diamonds","Spades","Clubs"};
		int[] values1 = {11,10,10,10,10,9};
		Deck deck1 = new Deck(ranks1,suits1,values1);
		System.out.println(deck1);
	}
}
