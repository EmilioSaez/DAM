import java.util.Scanner;

public class Example21 {
    public static void main(String[] args) {
        int cont = 0, positiveNumbers = 0, numbers;
        Scanner intputValue = new Scanner(System.in);
        
        while (cont < 10) {
            System.out.println("Write the number " + cont);
            numbers = intputValue.nextInt();
            if (numbers > 0) {
                positiveNumbers++;
            }
            cont++;
        }
        System.out.println("The total of positive numbers is:  " + positiveNumbers);
    }
}
