package solitare.freecell;

import java.util.HashMap;
import java.util.Map;

import decks.StandardDeck;
import decks.Suit;
import solitare.CardPile;
import solitare.Foundation;
import solitare.PlayFieldStack;

public class FreecellGame {

	private StandardDeck deck;
	
	private CardPile[] playAreaStack = new CardPile[8];
	private CardPile[] freecell		 = new CardPile[4];
	private Map<Suit, CardPile> foundation;

	public FreecellGame(){
		initilizePlayAreaStack();
		initilizeFreecell();
		initilizeFoundation();
	}

	public void newGame(){
	
		//TODO
	}

	public boolean moveCard(){
		return false; //TODO
	}

	private void initilizePlayAreaStack() {
		for (CardPile cardPile : playAreaStack) {
			cardPile = new PlayFieldStack();
		}
	}

	private void initilizeFreecell() {
		for (CardPile cardPile : freecell) {
			cardPile = new FreecellPile();
		}
	}

	private void initilizeFoundation() {
		foundation = new HashMap<Suit,CardPile>(4,1);
		
		for (Suit s : Suit.values()) {
			foundation.put(s, new Foundation(s));
		}
	}
	
	

	
	
}
