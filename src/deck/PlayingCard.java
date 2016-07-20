package deck;

/**
 * @author Bobby
 *
 */
public class PlayingCard extends Card {



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
	public String toString(){
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

