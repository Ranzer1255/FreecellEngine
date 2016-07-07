package deck;

import java.util.ArrayList;

public class StandardDeck {

	private ArrayList<PlayingCard> deck;

	public StandardDeck() {
		super();
		deck = new ArrayList<PlayingCard>();
		for (int i=1;i<=4;i++){
			for(int j = 1;j<=13;j++){
				deck.add(new PlayingCard(i,j));
			}
		}
	}
	
	public Card getCard(int index){	
		return deck.get(index);
	}
}
