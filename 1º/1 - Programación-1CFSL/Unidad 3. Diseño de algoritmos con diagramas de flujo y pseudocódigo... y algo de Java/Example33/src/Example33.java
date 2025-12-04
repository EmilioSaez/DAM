import java.util.Scanner;

public class Example33 {
    public static void main(String[] args) {
        final double LITTLE_VALUE = 0.00000000000000001;
        double calculation = 0, n, x, y = 0, total = 0;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write a number to find its square root of the first. ");
        n = inputValue.nextInt();
        x = n;
        y = 1 / 2f * (x + (n / x));
        total = x - y;
        if (total < 0) {
            total = -total;
        }
        while (total > LITTLE_VALUE) {
            x = y;
            y = 1 / 2f * (x + (n / x));
            total = x - y;
        }
        System.out.println(y);
    }
}
