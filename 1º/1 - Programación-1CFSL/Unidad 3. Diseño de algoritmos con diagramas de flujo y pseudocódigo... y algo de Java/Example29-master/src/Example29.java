//29.- Algoritmo que calcula el resto de la división de enteros mediante sucesivas restas

import java.util.Scanner;

public class Example29 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write two number to divide them");
        n1 = inputValue.nextInt();
        n2 = inputValue.nextInt();
        while (n1 >= n2) {
            n1 = n1 - n2;
        }
        System.out.println(n1);
    }
}
