package decks;

/**
 * @author Bobby
 *
 */
public class PlayingCard {

	private final Suit SUIT;
	private final Rank RANK;
	private final Color COLOR;
	
	
	public PlayingCard(Suit s, Rank r) {
		super();
		this.SUIT = s;
		this.RANK = r;
		if (SUIT==Suit.CLUBS||SUIT==Suit.SPADES)
			this.COLOR=Color.BLACK;
		else
			this.COLOR=Color.RED;
	}
		
	public Suit getSuit() {
		return SUIT;
	}
	
	public Rank getRank(){
		return RANK;
	}
	
	@Override
	public String toString() {
		return RANK + " of " + SUIT + "s";
	}
	
	public Color getColor(){
		return COLOR;
	}
	
	public boolean equals(PlayingCard pc){
		if (this.getRank()==pc.getRank()&&this.getSuit()==pc.getSuit()) return true;
		else return false;
	}

}

