public class MenuBuilder {

    public void showMainMenu() {
        System.out.println("Welcome to the casino! Please select from the following menu:\n" +
                "Press [1] Play a game of BlackJack\n" +
                "Press [2] Check your earnings" +
                "Press [2] Exit\n");

    }

    public void placeBet(){
        System.out.println("Welcome to the game! \n " +
                " Enter the number you would like to bet: ");
    }

    public void exitGame(){
        System.out.println("Thanks for playing!");
    }



}
