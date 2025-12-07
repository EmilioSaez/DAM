//Escribe un programa que cree una matriz de 10 x 10 elementos.
//Inicialice sus elementos a 0 y luego establezca en 1 los elementos (0, 4),
//(2, 6), (3, 1) y (8, 6). Y luego la imprima así:
//0 0 0 0 1 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 1 0 0 0
//0 1 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 1 0 0 0
//0 0 0 0 0 0 0 0 0 0
public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] myMatrix;
        myMatrix = new int[10][10];
        for (int row = 0; row <= 9; row++) {
            for (int col = 0; col <= 9; col++) {
                myMatrix[row][col] = 0;
            }
        }
        myMatrix[0][4] = 1;
        myMatrix[2][6] = 1;
        myMatrix[3][1] = 1;
        myMatrix[8][6] = 1;
        for (int col = 0; col <= 9; col++) {
            for (int fil = 0; fil <= 9; fil++) {
                System.out.print(myMatrix[col][fil]);
            }
            System.out.println();
        }
    }
}