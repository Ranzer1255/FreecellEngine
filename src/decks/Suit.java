package decks;

public enum Suit {

	SPADES(Color.BLACK, "Spade"),
	DIAMONDS(Color.RED, "Diamond"),
	CLUBS(Color.BLACK, "Club"),
	HEARTS(Color.RED, "Heart");
	
	final Color COLOR;
	final String NAME;
	
	Suit(Color color, String name){
		this.COLOR=color;
		this.NAME=name;
	}
	
	public Color getColor(){
		return COLOR;
	}
	
	public String toString(){
			return NAME;
	}
}
