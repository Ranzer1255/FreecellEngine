package decks;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Bobby
 *
 */
public class StandardDeck {

	private ArrayList<PlayingCard> deck;
	private Stack<PlayingCard> discard;
	

	/**
	 * Generates a new Sorted Deck of Standard Playing Cards.
	 */
	public StandardDeck(){
		deck = new ArrayList<PlayingCard>();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new PlayingCard(suit, rank));				
			}
		} 
	}
	
	/**
	 * draws the top card from the deck and moves it to the discard
	 * @return
	 */
	public PlayingCard Draw(){ return null; }//TODO
	
	/**
	 * adds the discard back into the deck and shuffles into a random order
	 */
	public void shuffle(){}
	
	public int getCardsInDeck(){
		return deck.size();
	}
	
	
}
