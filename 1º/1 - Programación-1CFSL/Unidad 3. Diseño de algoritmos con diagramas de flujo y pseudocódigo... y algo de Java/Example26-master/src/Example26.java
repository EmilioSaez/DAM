import java.util.Scanner;

//26.- Diseña un algoritmo que lea un número natural y escriba sus divisores.
public class Example26 {
    public static void main(String[] args) {
        int num, divisor = 0, supNum;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write a number to extract their divisors");
        num = inputValue.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisor = i;
                System.out.println("Is divisor of the  " + num + "= " + divisor);
            }
        }
        System.out.println(divisor);
    }
}
