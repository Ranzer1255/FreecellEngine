package decks;

/**
 * @author Bobby
 *
 */
public class PlayingCard extends Card {

	static public final int ACE = 1;
	static public final int JACK = 11;
	static public final int QUEEN = 12;
	static public final int KING = 13;
	static public final int SPADES = 1;
	static public final int DIAMONDS = 2;
	static public final int CLUBS = 3;
	static public final int HEARTS = 4;	
	private int suit;
	
	
	public PlayingCard(int suit, int value) {
		super();
		this.suit = suit;
		this.value = value;
	}
	
	public int getSuit() {
		return suit;
	}
	
	@Override
	public String toString() {
		String rtn = "";
		switch (value){
		case ACE:
			rtn += "Ace";
			break;
		case JACK:
			rtn += "Jack";
			break;
		case QUEEN:
			rtn += "Queen";
			break;
		case KING:
			rtn += "King";
			break;
		default:
			rtn += value;
		}
		rtn += " of ";
		switch (suit){
		case SPADES:
			rtn += "Spades!";
			break;
		case DIAMONDS:
			rtn += "Diamonds!";
			break;
		case CLUBS:
			rtn += "Clubs!";
			break;
		case HEARTS:
			rtn += "Hearts!";
			break;
		}
		
		return rtn;
	}

}

