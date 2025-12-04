import java.util.Scanner;

public class Example32 {
    public static void main(String[] args) {
        double calculation = 0, n, x, y = 0, total = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write a number to find its square root of the first. ");
        n = inputValue.nextInt();
        x = n;
        y = 1 / 2f * (x + (n / x));
        total = x - y;
        for (int i = 0; i <= 10; i++) {
            if (total < 0) {
                total = -total;
            } else {
                x = y;
                y = 1 / 2f * (x + (n / x));
            }
        }
        System.out.println(y);
    }
}
