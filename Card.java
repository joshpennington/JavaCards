package Card;
/**
 * Card Class
 *
 * @author Josh Pennington
 * @version 0.1.0
 *
 */

 public class Card
 {

	public static int SPADES = 1;
	public static int CLUBS = 2;
	public static int HEARTS = 3;
	public static int DIAMONDS = 4;
	public static int JACK = 11;
	public static int QUEEN = 12;
	public static int KING = 13;
	public static int HIGH_ACE = 14;
	public static int LOW_ACE = 1;
	//public static int JOKER = 15;

	private int suit;
	private int value;


 	/**
  	*
  	* Creates a card
  	* @param newSuit The suit of the card
  	* @param val The Value of the card
  	*/
 	public Card(int newSuit, int val)
 	{
 		suit = newSuit;
		value = val;
 	}

 	/**
  	*
  	* Gets The Suit of the card
  	* @return The Suit of the card
  	*
  	*/
  	public int getSuit()
  	{
  		return suit;
  	}

  	/**
   	*
   	* Gets the value of the card
   	* @return The Valus of the card
   	*
   	*/
   	public int getValue()
   	{
   		return value;
   	}

	/**
	 *
	 * To String method
	 * @return String Value of the card
	 *
	 */
	 public String toString()
	 {
	 	String returnVal= "";

		if(suit == SPADES)
		{
			returnVal += "S";
		}
		else if(suit == CLUBS)
		{
			returnVal += "C";
		}
		else if(suit == DIAMONDS)
		{
			returnVal += "D";
		}
		else if(suit == HEARTS)
		{
			returnVal += "H";
		}

		if(value == JACK)
		{
			returnVal += "J";
		}
		else if(value == QUEEN)
		{
			returnVal += "Q";
		}
		else if(value == KING)
		{
			returnVal += "K";
		}
		else if((value == HIGH_ACE) || (value == LOW_ACE))
		{
			returnVal += "A";
		}
		else
		{
			returnVal += value;
		}

		return returnVal;
	}

     /**
      *
      * Tells if this card is higher than another card
      * @param compare The Card being compared
      * @return True - Higher, False - Lower, null - Equal
      *
      */
     public boolean isHigherThan(Card compare)
     {
	 if(this.getValue() > compare.getValue()) {
	     return true;
	 }
	 else {
	     return false;
	 }
     }

     /**
      *
      * Tells if this card has an equal value to another card
      * @param compare The Card being compared
      * @return Boolean value based on if the value is the same
      *
      */
     public boolean hasEqualValue(Card compare)
     {
	 if(this.getValue() == compare.getValue())
	     return true;
	 else
	     return false;
     }

     /**
      *
      * Tells if the card has the same suit as another card
      * @param compare The card being compared
      * @return Boolean value based on if the suit is the same
      *
      */
     public boolean hasSameSuit(Card compare)
     {
	 if(this.getSuit() == compare.getSuit())
	     return true;
	 else
	     return false;
     }

     /**
      *
      * Tells if the cards suit is red
      * @return Boolean value if card is red
      *
      */
     public boolean isRed()
     {
     	if((getSuit() == HEARTS) || (getSuit() == DIAMONDS))
	{
		return true;
	}
	else
	{
		return false;
	}
     }

}
