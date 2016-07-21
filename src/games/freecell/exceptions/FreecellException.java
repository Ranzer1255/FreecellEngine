package games.freecell.exceptions;

@SuppressWarnings("serial")
public class FreecellException extends Exception {

	public FreecellException(String message){
		super(message);
	}
	
	public FreecellException() {
		super("generic Game Exception");
	}
	
}
