import java.util.Scanner;

public class BlackJackDemo {


    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        Player player = new Player();
        MenuBuilder menu = new MenuBuilder();
        BankAndScoreKeeper bankAndScoreKeeper = new BankAndScoreKeeper();
        Scanner textScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);
        String userTextInput;
        int userNumberInput;

        menu.showMainMenu();
        userNumberInput = numberScanner.nextInt();

        switch (userNumberInput) {
            case 1:
                menu.placeBet();
                userNumberInput = numberScanner.nextInt();
                bankAndScoreKeeper.addToPlayerBank(userNumberInput);

                dealer.shuffleDeck();

                dealer.addToDealerHand();
                dealer.printDealerHand();

                dealer.addToPlayersHand(player);
                dealer.addToPlayersHand(player);
                player.printPlayersHand();




                break;

            case 2:
                bankAndScoreKeeper.printPlayerBankAmount();
                break;

            case 3:
                menu.exitGame();
                break;


            default:
                break;
        }


    }

}
