package decks;

import java.util.ArrayList;

import javax.activity.InvalidActivityException;

/**
 * @author Bobby
 *
 */
public class StandardDeck {

	private ArrayList<PlayingCard> deck;

	/**
	 * @param sort determines if the deck is sorted on creation or shuffled. input a 0 for sorted 1 for shuffled
	 */
	public StandardDeck(int sort) throws IndexOutOfBoundsException{
		super();
		deck = new ArrayList<PlayingCard>();
		for (int i=1;i<=4;i++){
			for(int j = 1;j<=13;j++){
				deck.add(new PlayingCard(i,j));
			}
		}
	}
	
	public Card getCard(int index){	
		return deck.get(index);
	}
	
	public Card draw(){
		return deck.remove(0);
	}
}
