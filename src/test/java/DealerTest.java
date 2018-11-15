import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealerTest {

    Dealer dealer;
    Deck deck;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
        deck.populate();
        dealer = new Dealer(deck);
    }

    @Test
    public void canDealCard() {
        deck.shuffle();
        assertNotNull(dealer.dealCard(0));

    }
}
