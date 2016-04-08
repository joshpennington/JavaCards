package Card;
import java.util.Random;
import java.util.Stack;


/**
 *
 * Deck Of Cards
 * @author Josh Pennington
 * @version 0.1.0
 *
 */

 public class Deck
 {
	private Stack cards;
	private boolean isAceHigh;
	private boolean isAceLow;

	/**
	 *
	 * Creates a blank deck of cards
	 *
	 */
	public Deck()
	{
		cards = new Stack();
	}

	/**
	*
	* Adds a card to the deck
	* @param newCard The Card Being Added To The Deck
	*
	*/
	public void addCard(Card newCard)
	{
		cards.push(newCard);
	}

	/**
	 *
	 * Removes A Card From The Deck
	 * @return The Card On Top Of The Deck.  Null If No More Cards In Deck
	 *
	 */
	public Card dealCard()
	{
		if(cards.size() == 0)
		{
			return null;
		}
		else
		{
			return (Card)cards.pop();
		}
	}

	/**
	 *
	 * Tells what the top card on the Deck is without removing it
	 * @return The Card On Top Of The Deck (Not Removed From Deck).  Null If no cards in deck
	 *
	 */
	public Card topOfDeck()
	{
		if(cards.size() == 0)
		{
			return null;
		}
		else
		{
			return (Card)cards.peek();
		}
	}

	/**
	 *
	 * Sets Ace as a high card
	 *
	 */
	public void setAceHigh()
	{
		isAceHigh = true;
		isAceLow = false;
	}

	/**
	 *
	 * Sets Ace as a low card
	 *
	 */
	public void setAceLow()
	{
		isAceHigh = false;
		isAceLow = true;
	}

	/**
	 *
	 * Shuffles The Deck
	 *
	 */
	 public void shuffle()
	 {
		// Random Number Generator
		Random rand = new Random();
		// New Deck that will come from shuffled one
		Card newDeck[] = new Card[cards.size()];
		// The Stack converted to an array
		Object[] oldDeck = new Card[cards.size()];
		oldDeck = cards.toArray();
		// Initializes the new Deck array
		for(int i=0; i<newDeck.length; i++)
		{
			newDeck[i] = new Card(1,0);
		}
		// Placement variable for the placement of the new card in the array
		int placement = 0;

		for(int i=0; i<oldDeck.length; i++) {
			// Placement of the new card randomly generated
			placement = rand.nextInt(cards.size());
			// The there is a free spot here add it here
			if(newDeck[placement].getValue() == 0)
			{
				newDeck[placement] = (Card)oldDeck[i];

			}
			// else put in the next available spot in the array
			else
			{
				placement ++;
				if(placement == cards.size())
				{
					placement = 0;
				}
				boolean doAgain = true;
				do {
					if(newDeck[placement].getValue() == 0)
					{
						newDeck[placement] = (Card)oldDeck[i];
						doAgain = false;
					}
					else
					{
						placement++;
						if(placement == (cards.size()))
						{
							placement = 0;
						}
					}
				} while(doAgain);
			}
		}
		// Creates a new stack for the cards and puts the new deck into the stack
		cards = new Stack();
		for(int i=0; i<newDeck.length; i++)
		{
			cards.push(newDeck[i]);
		}
	 }

	/**
	 *
	 * Shuffles The Deck A Certain Number of Times
	 * @param num Number of times to shuffle the deck
	 *
	 */
	public void shuffle(int num)
	{
		for(int i=1; i!= num; i++)
		{
			shuffle();
		}
	}

	/**
	 *
	 * String representation of the Deck
	 *
	 */
	public String toString()
	{
		return(""+cards);
	}
 }
