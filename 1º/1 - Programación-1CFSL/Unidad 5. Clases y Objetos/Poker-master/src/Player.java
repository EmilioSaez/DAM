public class Player {
    private String name;
    private Card[] hand;
    private int numCards;
    public static final int MAX_HAND = 20;

    public Player(String name) {
        this.name = name;
        hand = new Card[MAX_HAND];
        for (int i = 0; i < MAX_HAND; i++) {
            hand[i] = null;

        }
        numCards = 0;
    }

    public Card distribute(MultiDeck card) {
        int drawnCards = 0;
        drawnCards = numCards;
        numCards++;
        hand[drawnCards] = card.extractCard();
        return hand[drawnCards];
    }

    public String toString() {
        String s = name + ":";
        boolean first = true;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) {
                if (first) {
                    first = false;
                } else {
                    s += ",";
                }
                s += hand[i];
            }
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public int getPunctuation() {
        boolean as = false;
        int punctuation = 0;
        int handCards = 0, preHandCards;
        preHandCards = handCards;
        handCards++;
        for (int i = 0; i < numCards; i++) {;
            if (hand[i].getNumber() == 1 && punctuation <= 10) {
                punctuation += 11;
                as = true;
            }else if (hand[i].getNumber() > 10) {
                punctuation += 10;
            } else {
                punctuation += hand[i].getNumber();
            }
        }
      if (punctuation>21){
          for (int i = 0; i < numCards; i++) {
              if (hand[i].getNumber()==1){
                  punctuation -= 10;
              }
          }
      }
        return punctuation;
    }


}

