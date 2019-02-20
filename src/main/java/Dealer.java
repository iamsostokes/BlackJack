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

    public int calculateCardValueInDealerHand(){
        int dealerSum = 0;

        for (int i = 0; i < dealersHand.size(); i++){
            dealerSum += dealersHand.get(i).getWeight();

        }
        return dealerSum;

    }

    public int compareHandTotalsReturnMax(Player player){
        ArrayList<Integer> bothHandTotals = new ArrayList<>();
        bothHandTotals.add(calculateCardValueInDealerHand());
        bothHandTotals.add(player.calculateCardValueInPlayerHand());

//        for(Integer number: bothHandTotals){
//            System.out.println("In the list" + number);
//        }

       return Collections.max(bothHandTotals);

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
