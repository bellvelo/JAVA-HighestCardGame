import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card(Suit.CLUBS, Rank.ACE);
    }

    @Test
    public void canGetSuit() {
        assertEquals(Suit.CLUBS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void canGetValueFromEnums() {
        assertEquals(1, card.getValueFromEnum());

    }
}
