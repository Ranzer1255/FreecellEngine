package games.freecell;

import java.util.HashMap;
import java.util.Map;

import decks.StandardDeck;
import decks.Suit;

public class FreecellGame {

	private StandardDeck deck;
	
	private CardPile[] playAreaStack = new CardPile[8];
	private CardPile[] freecell		 = new CardPile[4];
	private Map<Suit, CardPile> foundation;

	public FreecellGame(){
		instanciatePlayAreaStack();
		instaciateFreecell();
		instaciateFoundation();
	}

	public void newGame(){
	
		//TODO
	}

	public boolean moveCard(){
		return false; //TODO
	}

	private void instanciatePlayAreaStack() {
		for (CardPile cardPile : playAreaStack) {
			cardPile = new PlayFieldStack();
		}
	}

	private void instaciateFreecell() {
		for (CardPile cardPile : freecell) {
			cardPile = new Freecell();
		}
	}

	private void instaciateFoundation() {
		foundation = new HashMap<Suit,CardPile>(4,1);
		
		for (Suit s : Suit.values()) {
			foundation.put(s, new Foundation(s));
		}
	}
	
	

	
	
}
