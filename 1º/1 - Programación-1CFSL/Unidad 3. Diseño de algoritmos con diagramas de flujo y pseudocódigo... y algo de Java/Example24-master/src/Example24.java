//24.- Diseña un algoritmo para calcular el factorial de un número
import java.util.Scanner;
public class Example24 {
    public static void main(String[] args) {
        int number, supNumber;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("write a number to calculate the factorial");
        number = inputValue.nextInt();
        supNumber = number;
        for (int i = 1; i < supNumber; i++) {
            number = number * i;
        }
        System.out.println("The result is: " + number);
    }
}

