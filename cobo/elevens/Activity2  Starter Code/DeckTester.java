/**
TNPG: BrainForked (Gloria Lee, John Gupta-She, Jack Chen)
APCS pd 08
HW -- lab07
2022-03-19
time spent: 3 h 
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Giraffes", "Lions"};
		int[] values = {2, 1 ,6}; 
		Deck decker = new Deck(ranks, suits, values);
		System.out.println(decker);
		System.out.println(decker.deal());
		System.out.println(decker.isEmpty());
		System.out.println(decker.size());
		 
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
