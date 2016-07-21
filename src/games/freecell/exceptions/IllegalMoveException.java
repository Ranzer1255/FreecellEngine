package games.freecell.exceptions;

import decks.PlayingCard;

public class IllegalMoveException extends FreecellException {

	public IllegalMoveException() {
		super("This Move is illegal!");
	}
	public IllegalMoveException(PlayingCard e){
		super("the " + e.toString() + " cannot go here!");
	}
}
