package solitare.freecell;

import decks.PlayingCard;
import solitare.CardPile;

public class FreecellPile extends CardPile {
	
	@Override
	protected boolean isLegalMove(PlayingCard newCard, PlayingCard existingCard) {
		
		if (existingCard == null) return true;
		else return false;
	}

}
