/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    Card card1 = new Card("Three", "Spades", 3); 
	    Card card2 = new Card("Three", "Spades", 3); 
	    Card card3 = new Card("Nine", "Hearts", 9); 
	    System.out.println(card1.matches(card2));
	    System.out.println(card1.toString());
	    
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}
}
