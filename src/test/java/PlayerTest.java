import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Dealer dealer;
    Deck deck;


    @Before
    public void setUp() throws Exception {
        deck = new Deck();
        player = new Player();
        deck.populate();
        dealer = new Dealer(deck);


    }

    @Test
    public void countCards() {
        Card card  = dealer.dealCard(0);
        player.setHand(card);
        assertEquals(1, player.totalCards());
    }
}
