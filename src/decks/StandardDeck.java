package decks;

import java.util.ArrayList;

/**
 * @author Bobby
 *
 */
public class StandardDeck {

	private ArrayList<PlayingCard> deck;

	/**
	 * Generates a new Sorted Deck of Standard Playing Cards.
	 */
	public StandardDeck(){
		super();
		deck = new ArrayList<PlayingCard>();
		for (SuitType suit : SuitType.values()) {
			for (RankType rank : RankType.values()) {
				deck.add(new PlayingCard(suit, rank));				
			}
		} 
	}
}
