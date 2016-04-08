package Card;

/**
 *
 * Euchre Deck of Cards
 * @author Josh Pennington
 * @version 0.0.1
 *
 */

public class EuchreDeck extends Deck
{

	private int rightSuit;
	private int leftSuit;

	/**
	 *
	 * Creates A Standard Euchre Deck
	 *
	 */
	public EuchreDeck()
	{
		super();
		for(int i=1; i<=4; i++)
		{
			addCard(new Card(i, 9));
			addCard(new Card(i, 10));
			addCard(new Card(i, Card.JACK));
			addCard(new Card(i, Card.QUEEN));
			addCard(new Card(i, Card.KING));
			addCard(new Card(i, Card.HIGH_ACE));
		}
	}

	/**
	 *
	 * Sets The Right Suit For The Deck
	 * @param suit The suit of the right suit
	 *
	 */
	public void setRightSuit(int suit)
	{
		rightSuit = suit;
		if(rightSuit == Card.SPADES)
		{
			leftSuit = Card.CLUBS;
		}
		else if(rightSuit == Card.CLUBS)
		{
 			leftSuit = Card.SPADES;
		}
		else if(rightSuit == Card.DIAMONDS)
		{
			leftSuit = Card.HEARTS;
		}
		else if(rightSuit == Card.HEARTS)
		{
			leftSuit = Card.DIAMONDS;
		}
	}

	/**
	 *
	 * Gets The Right Suit For The Deck
	 * @return The Right Suit For The Deck
	 *
	 */
	public int getRightSuit()
	{
		return rightSuit;
	}

	/**
	 *
	 * Gets The Left Suit For The Deck
	 * @return The Left Suit For The Deck
	 *
	 */
	public int getLeftSuit()
	{
		return leftSuit;
	}
}