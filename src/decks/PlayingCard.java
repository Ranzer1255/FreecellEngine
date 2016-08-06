package decks;

import decks.Suit.Color;

/**
 * @author Bobby
 *
 */
public class PlayingCard {

	private final Suit SUIT;
	private final Rank RANK;
	
	
	public PlayingCard(Suit s, Rank r) {
		super();
		this.SUIT = s;
		this.RANK = r;
	}

	public Suit getSuit() {
		return SUIT;
	}

	public Rank getRank(){
		return RANK;
	}

	public int value(){
		return RANK.value();
	}

	@Override
	public String toString() {
		return RANK + " of " + SUIT + "s";
	}
	
	public Color getColor(){
		return SUIT.getColor();
	}

	public boolean equals(PlayingCard pc){
		if (this.getRank()==pc.getRank()&&this.getSuit()==pc.getSuit()) return true;
		else return false;
	}

}

