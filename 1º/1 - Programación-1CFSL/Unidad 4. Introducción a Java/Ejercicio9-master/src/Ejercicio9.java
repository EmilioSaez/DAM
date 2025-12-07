//Modifica el programa anterior para mostrar cuántas filas hay con todos
//los elementos 0 y cuántas columnas hay con todos los elementos 0.
//Ejercicio 9
//Sube Exercise9
//Rows 0 = 6 / Columns 0 = 7Salida:

//1 1 1 1 8 1 1 1 1 1
//1 1 1 1 1 1 1 1 1 1
//1 1 1 1 1 1 8 1 1 1
//1 8 1 1 1 1 1 1 1 1
//1 1 1 1 1 1 1 1 1 1
//1 1 1 1 1 1 1 1 1 1
//1 1 1 1 1 1 1 1 1 1
//1 1 1 1 1 1 1 1 1 1
//1 1 1 1 1 1 8 1 1 1
//1 1 1 1 1 1 1 1 1 1
public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] myMatrix;
        int totalcolumns = 0, totalRows = 0;
        boolean numberOne = true;
        myMatrix = new int[10][10];
        myMatrix[0][4] = 8;
        myMatrix[2][6] = 8;
        myMatrix[3][1] = 8;
        myMatrix[8][6] = 8;
        for (int row = 0; row <= 9; row++) {
            numberOne = true;
            for (int col = 0; col <= 9; col++) {
                if (myMatrix[row][col] != 0) {
                    numberOne = false;
                }
            }
            if (numberOne == true) {
                totalRows++;
            }
        }
        for (int col = 0; col <= 9; col++) {
            numberOne = true;
            for (int row = 0; row <= 9; row++) {
                if (myMatrix[row][col] != 0) {
                    numberOne = false;
                }
            }
            if (numberOne == true) {
                totalcolumns++;
            }
        }
        for (int col = 0; col <= 9; col++) {
            for (int fil = 0; fil <= 9; fil++) {
                System.out.print(myMatrix[col][fil]);
            }
            System.out.println();
        }
        System.out.println("the cools are:" + totalcolumns + ", and the rows are: " + totalRows);
    }
}