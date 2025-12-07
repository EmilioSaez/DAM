public class ArrayDemo {
    public static void main(String[] args) {
        int[][] myMatrix = new int[4][7];
        int cont = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                myMatrix[i][j] = cont;
                cont++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("Element at index " +
                        i + "," + j + ": " +
                        myMatrix[i][j]);
            }
        }
    }
}
