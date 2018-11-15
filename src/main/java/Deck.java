import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public void populate() {

        Suit[] allSuits = Suit.values(); // creates an array with all suit values
        Rank[] allRanks = Rank.values(); // creates an array with all rank values


            for(int j=0; j< allSuits.length; j++){

                for(int k=0; k< allRanks.length; k++){

                    Card card = new Card(allSuits[j], allRanks[k]);
                    this.cards.add(card);
                }
            }

//        System.out.println(this.cards.get(45).getSuit());
//        System.out.println(this.cards.get(45).getRank().getValue());

    }

//    public Card shuffle() {
//        Random random = new Random();
//        int low = 1;
//        int high = 52;
//        int index = random.nextInt(high-low) + low;
//        return this.cards.get(index);
//    }

    public void printCards(){
        for(Card card: this.cards){
            System.out.println(card.getSuit());
            System.out.println(card.getRank().getValue());
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }
    
}
