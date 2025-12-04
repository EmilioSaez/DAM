//Diseña un algoritmo que lea tres valores y muestre el mayor de ellos.

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        int n1, n2, n3;
        System.out.println("write three numbers");
        Scanner inputValue = new Scanner(System.in);
        n1 = inputValue.nextInt();
        n2 = inputValue.nextInt();
        n3 = inputValue.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("the bigger number is " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("The bigger number is " + n2);
        } else {
            System.out.println("The bigger number is " + n3);
        }

    }
}


