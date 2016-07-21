package decks;

public enum Suit {

	SPADES(1),
	DIAMONDS(2),
	CLUBS(3),
	HEARTS(4);
	
	final int SUIT;
	
	Suit(int value){
		this.SUIT=value;
	}
	
	public String toString(){
		switch(this.SUIT){
			case 1:
				return "Spade";
			case 2:
				return "Diamond";
			case 3:
				return "Club";
			case 4:
				return "Heart";
			default: //This should never happen
				return "err";
		}
	}
}
