import java.util.Scanner;

public class Example10 { //Diseña un algoritmo que lea un valor y muestre si es positivo o negativo (0 es positivo)
    public static void main(String[] args) { //
        int number;
        System.out.println("Write a number");
        Scanner inputValue = new Scanner(System.in);
        number = inputValue.nextInt();
        if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
    }
}
