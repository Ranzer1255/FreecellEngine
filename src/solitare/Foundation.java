package solitare;

import decks.PlayingCard;
import decks.Rank;
import decks.Suit;

public class Foundation extends CardPile {
	
	private final Suit SUIT;
	
	public Foundation(Suit s) {
		SUIT = s;
	}

	@Override
	protected boolean isLegalMove(PlayingCard newCard, PlayingCard existingCard) {

		if (existingCard==null){
			if(newCard.getSuit()==SUIT){
				if(newCard.getRank()==Rank.ACE){
					return true;
				}
			}
		} else if(newCard.getSuit()!=SUIT){
			return false;
		} else if (newCard.value()!=existingCard.value()+1){
			return false;
		} 

		return true;
	}

}
