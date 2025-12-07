public class Game {
    private Card[] cartons;
    private Drum drum;

    public Game(int numCards) {
        CardsGenerator generator = new CardsGenerator();
        cartons = new Card[numCards];
        for (int i = 0; i < numCards; i++) {
            cartons[i] = new Card(generator);
        }
        drum = new Drum(1, 90);
    }

    public void playForLine() {
        int ball;
        Card card;
        boolean line = false;
        while (!line) {
            ball = drum.extractBall();
            for (int totalCards = 0; totalCards < cartons.length; totalCards++) {
                card = cartons[totalCards];
                card.markNumber(ball);
            }
            for (int i = 0; i < cartons.length; i++) {
                if (cartons[i].isLine()) {
                    System.out.println("Line completed by card n. " + i);
                    System.out.println(cartons[i]);
                    line = true;
                }
            }
        }
    }


    public void playForBingo() {
        int ball;
        Card card;
        boolean bingo = false;
        while (!bingo) {
            ball = drum.extractBall();
            for (int totalCards = 0; totalCards < cartons.length; totalCards++) {
                card = cartons[totalCards];
                card.markNumber(ball);
            }
            for (int i = 0; i < cartons.length; i++) {
                if (cartons[i].isBingo()) {
                    System.out.println("Bingo completed by card n. " + i);
                    System.out.println(cartons[i]);
                    bingo = true;
                }
            }
        }
    }
    public void play() {
        playForLine();
        playForBingo();
    }
}

