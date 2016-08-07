package solitare.freecell;

import java.util.HashMap;
import java.util.Map;

import decks.StandardDeck;
import decks.Suit;
import decks.exceptions.EmptyDeckException;
import solitare.CardPile;
import solitare.Foundation;
import solitare.PlayFieldStack;

public class FreecellGame {

	private StandardDeck deck = new StandardDeck();
	
	private CardPile[] playAreaStack = new CardPile[8];
	private CardPile[] freecell		 = new CardPile[4];
	private Map<Suit, CardPile> foundation;

	public FreecellGame(){
		initilizePlayAreaStack();
		initilizeFreecell();
		initilizeFoundation();
	}

	public void newGame(){

		deck.shuffle();
		
		//deal to play area
		while(!deck.deckIsEmpty()){
			for (CardPile cp :playAreaStack){
				try {
					cp.deal(deck.draw());
				} catch (EmptyDeckException e) {
					break;
				}
			}
		}
	}

	public boolean moveCard(){
		return false; //TODO
	}

	private void initilizePlayAreaStack() {
		for (int i = 0; i<playAreaStack.length;i++) {
			playAreaStack[i] = new PlayFieldStack();
		}
	}

	private void initilizeFreecell() {
		for (int i = 0; i<freecell.length;i++) {
			freecell[i] = new FreecellPile();
		}
	}

	private void initilizeFoundation() {
		foundation = new HashMap<Suit,CardPile>(4,1);
		
		for (Suit s : Suit.values()) {
			foundation.put(s, new Foundation(s));
		}
	}
	
	

	
	
}
