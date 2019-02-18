import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();

    public Deck(){
        deckBuilder();
    }

    private void deckBuilder(){
        ArrayList<String> suits = new ArrayList<>(Arrays.asList("Heart", "Clubs", "Spades", "Diamonds"));
        ArrayList<String> ranks = new ArrayList<>(Arrays.asList("Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"));

        for (String suit: suits) {
            for (String rank: ranks) {
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }

        System.out.println(deck.size());

    }


}
