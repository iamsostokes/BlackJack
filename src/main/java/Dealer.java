import java.util.ArrayList;

public class Dealer {

    Deck deck = new Deck();

    private ArrayList<Card> dealersHand = new ArrayList<>();

    public void giveDealerACard(){
        dealersHand.add(deck.getAndRemoveFirstCardFromDeck());
    }

    public void printDealerHand() {
        for (Card dealerCard: dealersHand) {

            dealerCard.printCardDetails();

        }
    }

    public void printDetails() {
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
