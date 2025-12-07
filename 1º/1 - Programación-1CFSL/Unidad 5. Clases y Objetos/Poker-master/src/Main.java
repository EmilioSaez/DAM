import java.util.Scanner;
import java.util.Spliterator;

public class Main {
    public static final String SPACES = "------------------------";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decision = "";
        boolean gameOver = false;
        MultiDeck multiDeck = new MultiDeck(4);
        
        multiDeck.shuffle();
        Player player = new Player("Lombriz");
        Crupier crupier = new Crupier();

        playerStartDraw(player, multiDeck);
        System.out.println(SPACES);
        crupierStartDraw(crupier, multiDeck);
        System.out.println(SPACES);

        while (!gameOver){

            System.out.println("Do you want another card(Y/N)");
            decision = scanner.next().toUpperCase();
            if (decision.equals("Y")) {
                playerDraw(player,multiDeck);
                System.out.println(SPACES);
            }else if (decision.equals("N") && player.getPunctuation()<crupier.getPunctuation()){
                System.out.println("You Lose " + player.getName());
                gameOver = !gameOver;
                break;
            } else if (decision.equals("N") && player.getPunctuation()>crupier.getPunctuation()) {
                while (crupier.canPlayCard()){
                    crupierDraw(crupier,multiDeck);
                }
                if (player.getPunctuation()>crupier.getPunctuation()){
                    System.out.println(crupier.getPunctuation());
                    System.out.println(SPACES);
                    System.out.println("You Win " + player.getName());
                    gameOver = !gameOver;
                    break;
                }else if (crupier.getPunctuation()>player.getPunctuation()){
                    System.out.println("You Lose " + player.getName());
                    gameOver = !gameOver;
                    break;
                }else {
                    System.out.println("DRAW");
                    gameOver = !gameOver;
                    break;
                }

            }

            if (player.getPunctuation()>21){
                System.out.println("You Lose  " + player.getName());
                gameOver = !gameOver;
                break;
            }

            if (crupier.canPlayCard()){
                crupierDraw(crupier,multiDeck);
            }
            System.out.println(SPACES);
            if (crupier.getPunctuation()>21 && player.getPunctuation()<=21){
                System.out.println("You Win" + player.getName());
                gameOver = !gameOver;
            }

        }
    }

    private static void crupierStartDraw(Crupier crupier, MultiDeck multiDeck) {
        for (int i = 0; i < 2; i++) {
            crupier.distribute(multiDeck);
        }
        System.out.println(crupier);
        System.out.println("the crupier score is: "+crupier.getPunctuation());
    }

    private static void playerStartDraw(Player player, MultiDeck multiDeck) {
        for (int i = 0; i < 2; i++) {
            player.distribute(multiDeck);
        }
        System.out.println(player);
        System.out.println("Your score is: "+player.getPunctuation());

    }
    private static void playerDraw(Player player, MultiDeck multiDeck) {

        player.distribute(multiDeck);
        System.out.println(player);
        System.out.println("Your score is: "+player.getPunctuation());

    }
    private static void crupierDraw(Crupier crupier, MultiDeck multiDeck) {

        crupier.distribute(multiDeck);
        System.out.println(crupier);
        System.out.println("the crupier score is: "+crupier.getPunctuation());

    }

}
