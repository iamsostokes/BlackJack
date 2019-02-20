public class BankAndScoreKeeper {

    private double dealerBank = 50000.0;
    private double playerBank;
    private int numberOfWinsForPlayer = 0;
    private int numberOfWinsForDealer = 0;

//    public int calculateWinsForPlayer(Player player, Dealer dealer){
//        if (player.calculateCardValueInPlayerHand() == 21){
//            numberOfWinsForPlayer++;
//        } else if (player.calculateCardValueInPlayerHand() > dealer.calculateCardValueInDealerHand()){
//            numberOfWinsForPlayer++;
//        }
//
//        return numberOfWinsForPlayer;
//    }
//
//    public int calculateWinsForDealer (Player player, Dealer dealer){
//        if (dealer.calculateCardValueInDealerHand() == 21){
//            numberOfWinsForDealer++;
//        } else if (dealer.calculateCardValueInDealerHand() > player.calculateCardValueInPlayerHand()){
//            numberOfWinsForDealer++;
//        }
//
//        return numberOfWinsForDealer;
//    }

    public void determineWins(Player player, Dealer dealer){
        if(player.calculateCardValueInPlayerHand() == dealer.calculateCardValueInDealerHand()) {
            System.out.println("Its a tie!");
        }else if (player.calculateCardValueInPlayerHand() > 21){
            System.out.println("Busted!");
            numberOfWinsForDealer++;
        } else if(player.calculateCardValueInPlayerHand() == 21){
            System.out.println("You have blackjack!");
            numberOfWinsForPlayer++;
        } else if(dealer.calculateCardValueInDealerHand() > 21){
            System.out.println("Dealer busted!");
            numberOfWinsForPlayer++;
        } else if(dealer.calculateCardValueInDealerHand() == 21){
            System.out.println("Dealer has blackjack!");
            numberOfWinsForDealer++;
        } else if(dealer.calculateCardValueInDealerHand()> player.calculateCardValueInPlayerHand()) {
            System.out.println("Dealer wins this round!");
            numberOfWinsForDealer++;
        } else {
            System.out.println("You win this round!");
            numberOfWinsForPlayer++;
        }

    }



    public double addToPlayerBank(double userInput){

        playerBank =+ userInput;
        return playerBank;
//Todo figure out why a infinite loop happened
    }

    public void printPlayerBankAmount(){
        System.out.println("The amount you have in your bank is: " + playerBank);

    }

    public double getDealerBank() {
        return dealerBank;
    }

    public void setDealerBank(double dealerBank) {
        this.dealerBank = dealerBank;
    }

    public double getPlayerBank() {
        return playerBank;
    }

    public void setPlayerBank(double playerBank) {
        this.playerBank = playerBank;
    }

    public int getNumberOfWinsForPlayer() {
        return numberOfWinsForPlayer;
    }

    public void setNumberOfWinsForPlayer(int numberOfWinsForPlayer) {
        this.numberOfWinsForPlayer = numberOfWinsForPlayer;
    }

    public int getNumberOfWinsForDealer() {
        return numberOfWinsForDealer;
    }

    public void setNumberOfWinsForDealer(int numberOfWinsForDealer) {
        this.numberOfWinsForDealer = numberOfWinsForDealer;
    }
}
