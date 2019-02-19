import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private Deck deck = new Deck();

    private ArrayList<Card> dealersHand = new ArrayList<>();


    public void addToDealerHand(){
        dealersHand.add(deck.getAndRemoveFirstCardFromDeck());
    }

    public void addToPlayersHand(Player player){
      player.addToPlayersHand(deck.getAndRemoveFirstCardFromDeck());

    }


    public void printDealerHand() {
        System.out.println("Dealers Hand:");
        for (Card dealerCard: dealersHand) {
            dealerCard.printCardDetails();

        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck.getDeck());
    }

    public void printDeckDetails() {
        for (Card card: deck.getDeck()) {
            card.printCardDetails();
        }
    }


    public ArrayList<Card> getDealersHand() {
        return dealersHand;
    }

    public void setDealersHand(ArrayList<Card> dealersHand) {
        this.dealersHand = dealersHand;
    }


}
