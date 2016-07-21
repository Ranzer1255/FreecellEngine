package decks;

/**
 * @author Bobby
 *
 */
public class PlayingCard {

	private final SuitType SUIT;
	private final RankType RANK;
	
	
	public PlayingCard(SuitType suit, RankType rank) {
		super();
		this.SUIT = suit;
		this.RANK = rank;
	}
		
	public SuitType getSuit() {
		return SUIT;
	}
	
	@Override
	public String toString() {
		return RANK.toString() + " of " + SUIT.toString() + "s!";
	}

}

