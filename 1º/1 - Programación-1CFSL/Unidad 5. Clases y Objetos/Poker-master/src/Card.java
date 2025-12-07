public class Card {
    private int number;
    private String suit;
    public static final String[] SUITS = {"♠", "♥", "♦", "♣"};
    public Card(int number, String suit){
        this.number = number;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    public String toString(){
        String s = "";
        if (number<=10 && number>1) {
            s += number;
        } else if (number==1) {
            s += "A";
        } else if (number==11) {
            s += "J";
        } else if (number==12) {
            s += "Q";
        } else if (number==13) {
            s += "K";
        }
        return s+" de "+suit;
    }
}
