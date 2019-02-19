import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void getAndRemoveFirstCardFromDeck() {

        Deck deck = new Deck();

        Card card = deck.getAndRemoveFirstCardFromDeck();

        assertFalse(deck.getDeck().contains(card));

        Card card1 = deck.getDeck().get(50);

        assertTrue(deck.getDeck().contains(card1));

        assertTrue(deck.getDeck().size() == 51);
    }
}