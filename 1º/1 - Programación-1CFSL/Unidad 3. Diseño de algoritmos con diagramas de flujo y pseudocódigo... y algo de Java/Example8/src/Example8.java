import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        int age;
        System.out.println("Write your age: ");

        Scanner inputValue = new Scanner(System.in);
        age = inputValue.nextInt();
        if (age >= 18) {
            System.out.println("You have the legal age");
        }
    }
}
