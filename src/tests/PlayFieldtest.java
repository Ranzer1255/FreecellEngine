package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import decks.PlayingCard;
import decks.Rank;
import decks.StandardDeck;
import decks.Suit;
import games.freecell.CardPile;
import games.freecell.PlayFieldStack;
import games.freecell.exceptions.IllegalMoveException;

public class PlayFieldtest {

	private CardPile cp;
	private PlayingCard testCard1;
	private PlayingCard testCard2;
	
	@Before
	public void setUp() throws Exception {
		cp = new PlayFieldStack();
		testCard1 = new PlayingCard(Suit.SPADES, Rank.ACE);
		testCard2 = new PlayingCard(Suit.HEARTS, Rank.FIVE);
	}

	@Test
	public void testDeal() {
		cp = new PlayFieldStack();
		cp.deal(testCard1);
		assertTrue(cp.topCard()==testCard1);
		cp.deal(testCard2);
		assertTrue(cp.topCard()==testCard2);
	}
	
	@Test
	public void TestPlaceCardLegal() throws IllegalMoveException{
		cp.PlaceCard(testCard2);
		assertTrue(cp.topCard()==testCard2);
		cp.PlaceCard(new PlayingCard(Suit.CLUBS, Rank.FOUR));
		assertTrue(cp.topCard().equals(new PlayingCard(Suit.CLUBS, Rank.FOUR)));
	}

}
