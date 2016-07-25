package games.freecell.exceptions;

import decks.PlayingCard;

@SuppressWarnings("serial")
public class IllegalMoveException extends FreecellException {

	/**
	 * TODO the message may have to be handled diffirently latter down the line depending on how
	 * 		the exceptions get handled
	 */
	public IllegalMoveException() {
		super("This Move is illegal!");
	}
	public IllegalMoveException(PlayingCard e){
		super("the " + e + " cannot go here!"); 
	}
}
