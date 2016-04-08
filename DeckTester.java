package Card;

 /**
  *
  * Deck Tester Program
  * Test the functionality of all aspects of the Deck Project (on the command line)
  * @author Josh Pennington
  * @version 0.1.0
  */
 public class DeckTester
 {
	private static Deck standardDeck;
	private static Deck euchreDeck;
	private static Deck pinochleDeck;
	private static Hand testHand;

	/**
	 *
	 * Tests the functionality of all aspects of the Deck Project
	 *
	 */
	public static void main(String[] _)
	{
		System.out.println("Osiris Programming Group Card Testing Program.");
		System.out.println("This program is intended to test the card and deck program \n" );

		standardDeck = new StandardDeck();
		euchreDeck = new EuchreDeck();
		pinochleDeck = new PinochleDeck();
		testHand = new Hand();

		System.out.println("Standard Deck Implementation");
		System.out.println(standardDeck);
		System.out.println("\nEuchre Deck Implementation");
		System.out.println(euchreDeck);
		System.out.println("\nPinochle Deck Implementation");
		System.out.println(pinochleDeck);

		standardDeck.shuffle(100);
		euchreDeck.shuffle(100);
		pinochleDeck.shuffle(100);

		System.out.println("\nStandard Deck - Shuffled");
		System.out.println(standardDeck);
		System.out.println("\nEuchre Deck - Shuffled");
		System.out.println(euchreDeck);
		System.out.println("\nPinochle Deck - Shuffled");
		System.out.println(pinochleDeck);

		System.out.println("Hands Of Cards");
		System.out.println("Giving a hand of cards 5 cards");
		for(int i=0; i<=5; i++)
		{
			testHand.addCard(standardDeck.dealCard());
		}
		System.out.println(testHand);

	}
 }