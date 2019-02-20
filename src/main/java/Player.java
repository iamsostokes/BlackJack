import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playersHand = new ArrayList<>();
    private int playerSum;



    public void addToPlayersHand(Card card){
        playersHand.add(card);
    }

    public int calculateCardValueInPlayerHand(){

        for (int i = 0; i < playersHand.size() ; i++){
            playerSum += playersHand.get(i).getWeight();


        }
        return playerSum;


    }

    public void printPlayersHand(){
        System.out.println("Your hand: ");
        for(Card playerCard:playersHand){
            playerCard.printCardDetails();
        }
    }

    public ArrayList<Card> getPlayersHand() {
        return playersHand;
    }

    public void setPlayersHand(ArrayList<Card> playersHand) {
        this.playersHand = playersHand;
    }
}
