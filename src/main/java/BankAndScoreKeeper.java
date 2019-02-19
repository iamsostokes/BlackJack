public class BankAndScoreKeeper {

    private double dealerBank = 50000.0;
    private double playerBank;
    private int numberOfWins;

    public void wins(){
       //Todo make a counter for the number of wins in the game.
    }

    public double addToPlayerBank(double userInput){

        playerBank =+ userInput;
        return playerBank;

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

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }
}
