import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Board board = new Board();
        int drawCount = 0;
        boolean gameover = false;
        int row=0, col=0;
        Scanner scanner = new Scanner(System.in);
        Player player1 = getPlayerFromKeyboard(scanner, 1);
        Player player2 = getPlayerFromKeyboard(scanner, 2);
        Player currentPlayer = player1;
        while (!gameover) {
            if (currentPlayer.isaI()) {
                Player otherPlayer;
                if (currentPlayer == player1) {
                    otherPlayer = player2;
                } else {
                    otherPlayer = player1;
                }
                board.iaShoot(currentPlayer, otherPlayer);
            }else {
                System.out.println("Where you want to shoot?");
                System.out.println("row: ");
                row = scanner.nextInt();
                System.out.println("col: ");
                col = scanner.nextInt();
                board.shoot(row, col, currentPlayer);
            }
            drawCount++;
            System.out.println("Disparo de: "+ currentPlayer.getName());
            System.out.println(board);

            if (board.win(currentPlayer) == true) {
                System.out.println("You Win!!! " + currentPlayer.getName());
                gameover = true;
            }
            if (drawCount == 9) {
                System.out.println("Draw!!!");
                gameover = true;
            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
    }

    public static Player getPlayerFromKeyboard(Scanner scanner, int turn) {
        String symbol;
        String name;
        boolean ia;
        System.out.println("Enter your name: ");
        name = scanner.next();
        System.out.println("Are you Ai?: (true/false)");
        ia = scanner.nextBoolean();
        if (turn == 1) {
            symbol = "X";
        } else {
            symbol = "O";
        }
        return new Player(name, ia, symbol);
    }
}



