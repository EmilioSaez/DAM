//25.- Diseña un algoritmo que lea un número natural y escriba toda su tabla de multiplicar.


import java.util.Scanner;

public class Example25 {
    public static void main(String[] args) {
        int number, muliplicator;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write a number to have his multiplication table");
        number = inputValue.nextInt();
        for (int i = 0; i <= 10; i++) {
            muliplicator = number * i;
            System.out.println(number + " " + "* " + i + " " + "=" + muliplicator);
        }
    }
}
