import java.util.Scanner;

public class Example11 {//Diseña un algoritmo que lea dos valores y los muestre en orden ascendente.

    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Write tho numbers");
        Scanner inputValue = new Scanner(System.in);
        n1 = inputValue.nextInt();
        n2 = inputValue.nextInt();
        if (n1 > n2) {
            System.out.println(n2 + "  and " + " " + n1 + "  In ascendent order");
        } else {
            System.out.println(n1 +"  and "+ " " + n2 + "  In ascendent order");
        }
    }
}
