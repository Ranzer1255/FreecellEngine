package games.freecell;

import java.util.Stack;

import decks.PlayingCard;
import games.freecell.exceptions.IllegalMoveException;

public class PlayFieldStack {

	private Stack<PlayingCard> pile = new Stack<PlayingCard>();
	
	/**
	 * adds cards to the pile without following the rules of the game. Used for deals only.
	 */
	public void deal(PlayingCard c){
		pile.push(c);
	}
	
	/**
	 * takes the top card off the pile
	 * @return the current Top card off the pile. removing it in the .
	 */
	public PlayingCard takeCard(){
		return pile.pop();
	}
	
	/**
	 * Places a card on top of the pile, only if it follows the rules of Free Cell.
	 * 
	 * @param c PlayingCard to add to the pile
	 * @throws IllegalMoveException if move is invalid
	 */
	public void PlaceCard(PlayingCard newCard)throws IllegalMoveException{ 
		
		if (isLegalMove(newCard, pile.peek())){
			pile.push(newCard);
		} else {
			throw new IllegalMoveException(newCard); //TODO look over the message of illegalMove, this may need to change
		}
		
	
	}

	private boolean isLegalMove(PlayingCard newCard, PlayingCard existingCard) {
		
		if(newCard.getColor() == existingCard.getColor()){ // check color
			return false;
		} else if(newCard.getRank().value()!=existingCard.getRank().value()-1){// check if next lower in rank
			return false;
		} else 
			return true;
	}

}
