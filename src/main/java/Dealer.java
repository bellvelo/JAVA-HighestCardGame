import java.util.ArrayList;

public class Dealer {

    private Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
    }

    public Card dealCard(int index){
        Card card = this.deck.getCards().get(index);
        System.out.println(card.getSuit());
        System.out.println(card.getRank().getValue());
        return card;
    }
}
