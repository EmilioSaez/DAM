//14.- Diseña un algoritmo que lea tres valores y los muestre en orden ascendente

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        int n1, n2, n3;
        System.out.println("Write three numbers to order them");
        Scanner inputValue = new Scanner(System.in);
        n1 = inputValue.nextInt();
        n2 = inputValue.nextInt();
        n3 = inputValue.nextInt();
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println("The order is  " + n3 + " ," + n2 + " ," + n1);
            } else {
                System.out.println("The order is  " + n2 + " ," + n3 + ", " + n1);
            }
        }
        if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println("The order is  " + n3 + ", " + n1 + " ," + n2);
            } else {
                System.out.println("The order is  " + n1 + ", " + n3 + " ," + n2);
            }
        }
        if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                System.out.println("The order is  " + n2 + " ," + n1 + " ," + n3);
            } else {
                System.out.println("The order is  " + n1 + " ," + n2 + ", " + n3);
            }
        }
        ;

    }
}


