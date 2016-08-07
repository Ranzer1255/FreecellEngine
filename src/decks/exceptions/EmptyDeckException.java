package decks.exceptions;

public class EmptyDeckException extends Exception {

	public EmptyDeckException() {
		super("deck is empty");
	}
}
