public class Card {

    private String suit;
    private String rank;
    private int weight;


    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.weight = weightOfCard(rank);
    }

    public int weightOfCard(String rank) {
        int card = 0;

        if (rank.equalsIgnoreCase("ace")) {
            card = 1;

        } else if (rank.equalsIgnoreCase("2")) {
            card = 2;

        } else if (rank.equalsIgnoreCase("3")) {
            card = 3;

        } else if (rank.equalsIgnoreCase("4")) {
            card = 4;

        } else if (rank.equalsIgnoreCase("5")) {
            card = 5;

        } else if (rank.equalsIgnoreCase("6")) {
            card = 6;

        } else if (rank.equalsIgnoreCase("7")) {
            card = 7;

        } else if (rank.equalsIgnoreCase("8")) {
            card = 8;

        } else if (rank.equalsIgnoreCase("9")) {
            card = 9;

        } else if (rank.equalsIgnoreCase("10")) {
            card = 10;

        } else if (rank.equalsIgnoreCase("jack")) {
            card = 11;

        } else if (rank.equalsIgnoreCase("queen")) {
            card = 12;

        } else if (rank.equalsIgnoreCase("king")) {
            card = 13;

        }
        return card;
    }

    public void printCardDetails() {
        System.out.println(getRank() + " of " + getSuit() + "\n");
    }


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}





