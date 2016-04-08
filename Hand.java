package Card;
import java.util.Vector;


/**
 *
 * A Hand Of Cards
 * @author Josh Pennington
 * @version 0.0.1
 *
 */

 public class Hand
 {
	private Vector hand;

	/**
	 *
	 * Creates a new hand of cards
	 *
	 */
	public Hand()
	{
		hand = new Vector();
	}

	/**
	 *
	 * Adds the passed card to the hand
	 * @param card The Card being added to the hand
	 *
	 */
	public void addCard(Card card)
	{
		hand.add(card);
	}

	/**
	 *
	 * Returns The Card at the index and removes it from the hand
	 * @param index The location of the card being removed
	 * @return The Card That Has Been Removed
	 *
	 */
	public Card removeCard(int index)
	{
		Card returnVal = (Card)hand.get(index);
		hand.removeElementAt(index);
		return returnVal;
	}

	/**
	 *
	 * The String representation of the hand
	 *
	 */
	public String toString()
	{
		return(""+hand);
	}
 }
