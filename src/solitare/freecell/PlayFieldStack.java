package solitare.freecell;

import decks.PlayingCard;

public class PlayFieldStack extends CardPile {

	@Override
	protected boolean isLegalMove(PlayingCard newCard, PlayingCard existingCard) {
		
		if(existingCard== null){
			return true;
		}else if(newCard.getColor() == existingCard.getColor()){ // check color
			return false;
		} else if(newCard.value()!=existingCard.value()-1){// check if next lower in rank
			return false;
		} else 
			return true;
	}

}
