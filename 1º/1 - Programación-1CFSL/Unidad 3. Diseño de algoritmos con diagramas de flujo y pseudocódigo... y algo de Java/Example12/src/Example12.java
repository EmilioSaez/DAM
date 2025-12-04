//12.- Diseña un algoritmo que lea dos valores y muestre el mayor de ellos

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("write tho numbers");
        Scanner inputValue = new Scanner(System.in);
        n1 = inputValue.nextInt();
        n2 = inputValue.nextInt();
        if (n1 > n2) {
            System.out.println("the biggest number is " + n1);
        } else {
            System.out.println("The biggest number is " + n2);
        }
    }
}
