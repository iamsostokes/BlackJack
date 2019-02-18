import java.util.ArrayList;

public class BlackJackDemo {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Dealer dealer = new Dealer();
        deck.printDetails();

        System.out.println("_______________________________________________");

        dealer.giveDealerACard(deck);
        System.out.println("_______________________________________________");

        dealer.printDealerHand();

        System.out.println("_______________________________________________");



        deck.printDetails();

    }

}
