import java.util.Scanner;

public class Board {
    private String[][] board;
    public String ESPACIO_VACIO = " ";

    public Board() {
        board = new String[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ESPACIO_VACIO;
            }
        }
    }

    @Override
    public String toString() {
        String s = "  ";
        for (int i = 1; i <= board[0].length; i++) {
            s += i + ESPACIO_VACIO;
        }
        s += "\n";

        for (int row = 0; row < board.length; row++) {
            s += (row + 1) + ESPACIO_VACIO;
            for (int col = 0; col < board[0].length; col++) {
                s += board[row][col] + ESPACIO_VACIO;
            }
            s += "\n";

        }
        return s;
    }

    public void shoot(int row, int col, Player player) {
        Scanner inputValue = new Scanner(System.in);
        while (!board[row - 1][col - 1].equals(ESPACIO_VACIO)) {
            System.out.println("Try another cell");
            System.out.println("Row: ");
            row = inputValue.nextInt();
            System.out.println("Column: ");
            col = inputValue.nextInt();
        }
        board[row - 1][col - 1] = player.getSymbol();
    }


    public Boolean win(Player player) {
        int contWin = 0;

        for (int row = 0; row < 3; row++) {
            contWin=0;
            for (int col = 0; col < 3; col++) {
                if (board[row][col].equals(player.getSymbol())){
                    contWin++;
                }

            }
            if (contWin == 3) {
                return true;
            }
        }


        contWin = 0;
        for (int col = 0; col < 3; col++) {
            contWin=0;
            for (int row = 0; row < 3; row++) {
                if(board[row][col].equals(player.getSymbol())){
                    contWin++;
                }
            }
            if (contWin == 3) {
                return true;
            }
        }
        contWin=0;

        for (int row_col = 0; row_col < 3; row_col++) {
            if (board[row_col][row_col].equals(player.getSymbol())) {
                contWin++;
            }
        }
        if (contWin == 3) {
            return true;
        }
        contWin = 0;
        for (int i = 0; i < 3; i++) {
            if (board[i][2 - i].equals(player.getSymbol())) {
                contWin++;
            }
        }
        if (contWin == 3) {
            return true;
        }
        contWin = 0;
        return false;
    }

    public void iaShoot(Player ia,Player otherPlayer) {
        //Col
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].equals(ESPACIO_VACIO)){
                    board[row][col]=ia.getSymbol();
                    if (win(ia)){
                        return;
                    }else{
                        board[row][col]=ESPACIO_VACIO;
                    }

                }

            }

        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].equals(ESPACIO_VACIO)){
                    board[row][col]=otherPlayer.getSymbol();
                    if (win(otherPlayer)){
                        board[row][col]=ia.getSymbol();
                        return;
                    }else{
                        board[row][col]=ESPACIO_VACIO;
                    }
                }
            }
        }
        //Si no puede ganar ni bloquear  centro
        if (board[1][1].equals(ESPACIO_VACIO)) {
            board[1][1] = ia.getSymbol();
            return;
        }
        if (!board[1][1].equals(ESPACIO_VACIO)) {
            if (board[0][0].equals(ESPACIO_VACIO)){
                board[0][0] = ia.getSymbol();
            } else if (board[2][2].equals(ESPACIO_VACIO)) {
                board[2][2] = ia.getSymbol();
            } else if (board[0][2].equals(ESPACIO_VACIO)) {
                board[0][2] = ia.getSymbol();
            } else if (board[2][0].equals(ESPACIO_VACIO)) {
                board[2][0] = ia.getSymbol();
            }else {
                int row, col;
                do {
                    row = (int) (Math.random() * 3);
                    col = (int) (Math.random() * 3);
                } while (!board[row][col].equals(ESPACIO_VACIO));
                board[row][col] = ia.getSymbol();
            }
            }

        }


}
