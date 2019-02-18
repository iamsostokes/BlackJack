import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> dealersHand = new ArrayList<>();

    public Card giveDealerACard(Deck deck){
        Card card1 = deck.getDeck().get(0);
        dealersHand.add(card1);
        deck.getDeck().remove(0);
        return card1;

    }

    public void printDealerHand() {
        for (Card dealerCard: dealersHand) {

            dealerCard.printCardDetails();

        }
    }


    public ArrayList<Card> getDealersHand() {
        return dealersHand;
    }

    public void setDealersHand(ArrayList<Card> dealersHand) {
        this.dealersHand = dealersHand;
    }


}
