import java.util.ArrayList;

public class BlackJackDemo {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        dealer.printDetails();

        System.out.println("_______________________________________________");

        dealer.giveDealerACard();
        System.out.println("_______________________________________________");

        dealer.printDealerHand();

        System.out.println("_______________________________________________");



        dealer.printDetails();

    }

}
