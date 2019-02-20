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
                dealer.calculateCardValueInDealerHand();
                System.out.println("The dealer hand total is " + dealer.calculateCardValueInDealerHand() + "\n");

                dealer.addToPlayersHand(player);
                dealer.addToPlayersHand(player);
                player.printPlayersHand();
                System.out.println("Your hand total is " + player.calculateCardValueInPlayerHand() + "\n");

                System.out.println("The max value is: " + dealer.compareHandTotalsReturnMax(player));


                do {
                    if (dealer.calculateCardValueInDealerHand() < 21 && player.calculateCardValueInPlayerHand() < 21) {
                        menu.hitOrStand();
                        userNumberInput = numberScanner.nextInt();

                        if (userNumberInput == 1) {
                            dealer.hitMePlayer(player);
                            if(player.calculateCardValueInPlayerHand() > 21){
                                System.out.println("Busted!");
                                hitMe = false;
                            } else {
                                hitMe = true;
                            }

                        }
//                } else if(dealer.calculateCardValueInDealerHand() == 21 || player.calculateCardValueInPlayerHand() ==21 ){
//                    //Todo Start new round and declare winner and add to counter
//                } else if(dealer.calculateCardValueInDealerHand() == 21 && player.calculateCardValueInPlayerHand() == 21){
//                    //Todo declare a tie
//                } else {
//                    System.out.println("There is a issue");
//                }


                    }
                } while (hitMe);

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
