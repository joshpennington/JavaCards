package Card;

/**
 *
 * Standard Deck of cards
 * @author Josh Pennington
 * @version 0.1.0
 *
 */

 public class StandardDeck extends Deck
 {
	/**
	 *
	 * Creates a standard 52 Card Deck
	 *
	 */
	public StandardDeck()
	{
		super();
		setAceHigh();
		// Creates The Spades
		for(int i=0; i<=12; i++)
		{
			addCard(new Card(Card.SPADES, i+1));
		}

		// Creates The Clubs
		for(int i=13; i<=26; i++)
		{
			addCard(new Card(Card.CLUBS, i-12));
		}

		// Creates The Hearts
		for(int i=27; i<=39; i++)
		{
			addCard(new Card(Card.HEARTS, i-25));
		}

		// Creates The Diamonds
		for(int i=40; i<=53; i++)
		{
			addCard(new Card(Card.DIAMONDS, i-39));
		}
	}
 }
