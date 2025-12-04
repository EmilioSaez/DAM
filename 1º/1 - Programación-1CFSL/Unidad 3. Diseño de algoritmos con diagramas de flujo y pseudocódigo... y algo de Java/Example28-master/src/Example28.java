//28.- Diseña un algoritmo que calcule un producto de 2 números > 0 utilizando sumas sucesivas
import java.util.Scanner;
public class Example28 {
    public static void main(String[] args) {
        int num1, num2, sum = 0, total = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write two numbers to multiply them");
        num1 = inputValue.nextInt();
        num2 = inputValue.nextInt();
        for (int i = 0; i < num2; i++) {
            total= total + num1;
        }
        System.out.println(total);
    }
}
