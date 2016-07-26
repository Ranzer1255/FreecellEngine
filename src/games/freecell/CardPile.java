package games.freecell;

import java.util.Deque;
import java.util.LinkedList;
import decks.PlayingCard;
import games.freecell.exceptions.IllegalMoveException;

public abstract class CardPile {

	private Deque<PlayingCard> pile;

	protected abstract boolean isLegalMove(PlayingCard newCard, PlayingCard existingCard);

	public CardPile() {
		pile = new LinkedList<PlayingCard>();		
	}

	/**
	 * adds cards to the pile without following the rules of the game. Used for deals only.
	 */
	public void deal(PlayingCard c) {
		pile.push(c);
	}

	/**
	 * takes the top card off the pile
	 * @return the current Top card off the pile. removing it from the pile.
	 */
	public PlayingCard takeCard() {
		return pile.pop();
	}

	/**
	 * Places a card on top of the pile, only if it follows the rules of the current implimentation.
	 * 
	 * @param c PlayingCard to add to the pile
	 * @throws IllegalMoveException if move is invalid
	 */
	public void PlaceCard(PlayingCard newCard) throws IllegalMoveException { 
		
		if (isLegalMove(newCard, pile.peek())){
			pile.push(newCard);
		} else {
			throw new IllegalMoveException(newCard); //TODO look over the message of illegalMove, this may need to change
		}
	}
	
	public PlayingCard topCard(){
		return pile.peek();
	}
}
