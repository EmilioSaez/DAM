import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        int n1, n2, sum, rest, division, multiplication;
        System.out.println("Dime dos numeros enteros");
        Scanner inputValue = new Scanner(System.in);
        n1 = inputValue.nextInt();
        n2 = inputValue.nextInt();
        sum = n1 + n2;
        rest = n1 - n2;
        division = n1 / n2;
        multiplication = n1 * n2;
        System.out.println("la suma de " + n1 + " " + "+ " + n2 + " es igual a = " + sum);
        System.out.println("la resta de " + n1 + " " + "- " + n2 + " es igual a = " + rest);
        System.out.println("la division de " + n1 + " " + "/ " + n2 + " es igual a = " + division);
        System.out.println("la multiplicacion de " + n1 + " " + "* " + n2 + " es igual a = " + multiplication);
    }
}
