import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        float realPrice, retailPrice, discount;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write the inicial and the final price");
        realPrice = inputValue.nextInt();
        retailPrice = inputValue.nextInt();
        discount = (realPrice - retailPrice) / realPrice;
        System.out.println("The final prize is  = " + retailPrice + " applying a discount of " + discount * 100 + " %" );
    }
}
