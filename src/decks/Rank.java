package decks;

public enum Rank {
	
	ACE(1),
	TWO(2),
	TRHEE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13);

	public final int RANK;
	
	Rank(int value){
		this.RANK=value;
	}
	
	public String toString() {
		switch (RANK){
		case 1:
			return "Ace";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		default:
			return ""+this.RANK;
		}
	}
	
}
