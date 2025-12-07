import java.sql.Array;

public class MultiDeck {
    private Card[] cards;
    private int totalCards;
    public MultiDeck(int numDecks){
        cards = new Card[52 * numDecks];
        int cont=0;
        int suitsNum = 4;
        for (int i = 0; i < numDecks; i++) {
            for (int j = 0; j <suitsNum; j++) {
                for (int k = 1; k <= 13; k++) {
                    cards[cont]=new Card(k,Card.SUITS[j]);
                    cont++;
                }
            }
        }
        totalCards = cards.length;
    }
    public void shuffle(){
        int aleatNum,otherAleatNum;
        Card card;
        for (int i = 0; i < cards.length ; i++) {
            aleatNum = (int)(Math.random()*cards.length);
            otherAleatNum = (int)(Math.random()*cards.length);
            card = cards[aleatNum];
            cards[aleatNum]=cards[otherAleatNum];
            cards[otherAleatNum]=card;
        }
    }
    public Card extractCard(){
        totalCards--;
        return cards[totalCards];
    }
    @Override
    public String toString(){
        int numSuits=4;
        boolean first = true;

        String s = "";
        for (int i = 0; i < 4 ; i++) {
            first = true;
            for (int j = 0; j < totalCards; j++) {
                if (cards[j].getSuit().equals(Card.SUITS[i])){
                    if (first){
                        first=false;
                    }else {
                        s += ",";
                    }
                    s += cards[j];
                }
            }
            s += "\n";

        }

        return s;
    }
}
