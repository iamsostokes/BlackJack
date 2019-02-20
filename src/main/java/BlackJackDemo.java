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
        boolean hitMe = false;
        boolean playAgain = false;

        menu.showMainMenu();
        userNumberInput = numberScanner.nextInt();

        do {
            switch (userNumberInput) {
                case 1:
                    menu.placeBet();
                    userNumberInput = numberScanner.nextInt();
                    bankAndScoreKeeper.addToPlayerBank(userNumberInput);

                    dealer.shuffleDeck();

                    dealer.addToDealerHand();
                    dealer.printDealerHand();
                    dealer.calculateCardValueInDealerHand();
                    System.out.println("The dealer hand total is " + dealer.calculateCardValueInDealerHand() + "\n");

                    dealer.addToPlayersHand(player);
                    dealer.addToPlayersHand(player);
                    player.printPlayersHand();
                    System.out.println("Your hand total is " + player.calculateCardValueInPlayerHand() + "\n");


                    do {

                            menu.hitOrStand();
                            userNumberInput = numberScanner.nextInt();

                            if (userNumberInput == 1 && player.calculateCardValueInPlayerHand() < 21) {
                                dealer.hitMePlayer(player);
                                hitMe = true;
                            }
                            if(userNumberInput == 2 || player.calculateCardValueInPlayerHand() >= 21){
                               hitMe = false;
                            }


                    } while (hitMe);

                    dealer.dealerGetsNewCards();
                    bankAndScoreKeeper.determineWins(player, dealer);



                    playAgain = true;
                    break;

                case 2:
                    break;

                case 3:
                    menu.exitGame();
                    break;


                default:
                    break;
            }

            System.out.println("Would you like to go to main menu? \n" +
                    "Press [1] Main Menu \n" +
                    "Press [2] Exit");
            userNumberInput = numberScanner.nextInt();

            if (userNumberInput == 1){
                playAgain = true;
                dealer.getDealersHand().clear();
                player.getPlayersHand().clear();

            } else if (userNumberInput == 2){
                playAgain = false;
            }else {
                System.out.println("Make sure to enter a number: ");
                playAgain = true;
            }

        } while (playAgain);
    }

}
