import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeckTest {

    Deck deck;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
    }

    @Test
    public void canPopulateDeck() {
        deck.populate();
        assertEquals(52, deck.getCardCount());
//        assertEquals(Suit.DIAMONDS, deck.);
    }

    @Test
    public void getCardCount() {
        assertEquals(0, deck.getCardCount());
    }

//    @Test
//    public void canGetRandomCard() {
//        deck.populate();
//        assertNotNull(deck.shuffle());
//    }

    @Test
    public void canPrintCards() {
        deck.populate();
        deck.printCards();
        assertEquals(true, true);
    }
}
