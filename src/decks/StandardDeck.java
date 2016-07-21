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
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new PlayingCard(suit, rank));				
			}
		} 
	}
}
