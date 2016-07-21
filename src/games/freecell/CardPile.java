package games.freecell;

import java.util.Stack;

import decks.PlayingCard;
import games.freecell.exceptions.FreecellException;
import games.freecell.exceptions.IllegalMoveException;

public class CardPile {

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
	public void PlaceCard(PlayingCard c)throws FreecellException{ 
		
		PlayingCard topCard = pile.peek();
		if (c.getColor()!=topCard.getColor() && c.getRank().VALUE == topCard.getRank().VALUE-1){
			pile.push(c);
		} else {
			throw new IllegalMoveException(c);
		}
		
	
	}

}
