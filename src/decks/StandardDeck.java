package decks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Bobby
 *
 */
public class StandardDeck {

	private ArrayList<PlayingCard> deck;
	private LinkedList<PlayingCard> discard;
	

	/**
	 * Generates a new Sorted Deck of Standard Playing Cards.
	 */
	public StandardDeck(){
		deck = new ArrayList<>();
		discard = new LinkedList<>();
		
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new PlayingCard(suit, rank));				
			}
		} 
	}
	
	/**
	 * draws the top card from the deck and moves it to the discard
	 * @return Top card in Deck.
	 */
	public PlayingCard draw(){ 
		PlayingCard c = deck.remove(0);
		discard.push(c);
		return c;
	}
	
	/**
	 * adds the discard back into the deck and shuffles into a random order
	 */
	public void shuffle(){
		
		//add discard back to the deck
		deck.addAll(discard);
		discard.clear();
		
		//shuffle the deck
		for(int i = deck.size(); i>2; i--){
			
			int s = ThreadLocalRandom.current().nextInt(i);
			
			PlayingCard t = deck.get(s);
			deck.set(s, deck.get(i));
			deck.set(i, t);
		}
	}

	public int getCardsInDeck(){
		return deck.size();
	}
	
	
}
