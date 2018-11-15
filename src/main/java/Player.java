import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<Card>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int totalCards() {
        return this.hand.size();
    }

    public void setHand(Card card) {
        this.hand.add(card);
    }
}
