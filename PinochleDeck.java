package Card;

/**
 * Pinochle Deck
 * @author Josh Pennington
 * @version 0.0.1
 *
 */

public class PinochleDeck extends Deck
{

	/**
	 *
	 * Creates a Pinochle Deck
	 *
	 */
	public PinochleDeck()
	{
		super();
		for(int i=1; i<=4; i++)
		{
			 for(int j=10; j<=14; j++)
			 {
				for(int k=1; k<=4; k++)
				{
					addCard(new Card(i, j));
				}
			}
		}
 	}
}
