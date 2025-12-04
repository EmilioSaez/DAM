import java.util.Scanner;

public class Example31 {
    public static void main(String[] args) {
        int n1;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("write a number");
        n1 = inputValue.nextInt();
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1 - i; j++) {
                System.out.print("/ ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= n1 - i; j++) {
                System.out.print("/ ");
            }
            System.out.println();
        }
    }
}