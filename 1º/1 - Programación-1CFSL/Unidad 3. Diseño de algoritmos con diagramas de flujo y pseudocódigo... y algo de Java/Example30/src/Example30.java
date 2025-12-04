//Diseña un algoritmo que lea un número n y luego imprima esto

import java.util.Scanner;

public class Example30 {
    public static void main(String[] args) {
        int n1;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("write a number");
        n1 = inputValue.nextInt();
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

