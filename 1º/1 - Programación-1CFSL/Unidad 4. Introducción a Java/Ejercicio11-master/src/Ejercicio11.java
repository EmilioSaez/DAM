import java.util.Scanner;

//Escribe un programa que simule el juego "Batalla Naval" sobre un tablero de 8x8.
//La computadora colocará 10 barcos al azar (de una sola celda). El usuario
//introducirá una coordenada (primera letra y luego un número) y el programa
//escribirá el tablero completo cada vez, con los barcos hundidos (X) y los disparos
//fallidos (círculos). Mostrará el contador de disparos y el número de barcos
//hundidos.
public class Ejercicio11 {
    static int sunkShips = 0, contShoots = 0;
    public static final char SPACE = '·';
    public static final char SHIP = 'S';
    public static final char SUNK_SHIP = 'X';
    public static final char WATER = 'O';
    public static final int NUM_ROWS_COLS = 8;
    public static final int NUM_SHIPS = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        int x, y;
        char[][] enemyNaval;
        enemyNaval = new char[8][8];
        System.out.println("Write a cord 1-8 and a cord A-H");
        initMatrix(enemyNaval);
        addShips(enemyNaval);
        while (gameOver == false) {
            System.out.println(contShoots + " Shoots");
            System.out.println(sunkShips + " Sunk Ships");
            printMatrix(enemyNaval);
            System.out.println("Cord number: ");
            x = atackX(scanner);
            System.out.println("Cord letter: ");
            y = atackY(scanner);
            attack(enemyNaval, y, x);
            if (sunkShips == NUM_SHIPS) {
                printMatrix(enemyNaval);
                System.out.println("You win");
                gameOver = true;
            }
        }
    }

    static void attack(char[][] matrix, int x, int y) {

        if (matrix[x][y] == SHIP) {
            matrix[x][y] = SUNK_SHIP;
            sunkShips++;
            contShoots++;
        } else {
            matrix[x][y] = WATER;
            contShoots++;
        }


    }

    static int atackX(Scanner scanner) {
        int nx;
        do {
            nx = scanner.nextInt();

            if (nx < 1 || nx > NUM_ROWS_COLS) {
                System.out.println("Enter a number between 1 and 8");
            }

        } while (nx < 1 || nx > NUM_ROWS_COLS);
        return nx - 1;

    }

    static int atackY(Scanner scanner) {
        int ny;
        do {
            ny = scanner.next().toUpperCase().charAt(0) - 65; //Ascii A == 65 y H == 72
            if (ny < 0 || ny > 7) {
                System.out.println("Enter a letter between A and H");
            }

        } while (ny < 0 || ny > 7);
        return ny;

    }

    static void addShips(char[][] matrix) {
        int cont = 0, n1, n2;
        while (cont < NUM_SHIPS) {
            n1 = (int) (Math.random() * 8);
            n2 = (int) (Math.random() * 8);
            if (matrix[n1][n2] == SPACE) {
                matrix[n1][n2] = SHIP;
                cont++;
            }
        }
    }

    static void printMatrix(char[][] matrix) {
        final char[] LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int col = 0; col < matrix.length; col++) {
            System.out.print(LETTERS[col] + " ");

            for (int fil = 0; fil < matrix[0].length; fil++) {
                if (matrix[col][fil] == SHIP) {
                    System.out.print(SPACE + " ");
                } else {
                    System.out.print(matrix[col][fil] + " ");
                }
            }
            System.out.println();
        }
    }

    static void initMatrix(char[][] matrix) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                matrix[row][col] = SPACE;

            }
        }

    }
}





