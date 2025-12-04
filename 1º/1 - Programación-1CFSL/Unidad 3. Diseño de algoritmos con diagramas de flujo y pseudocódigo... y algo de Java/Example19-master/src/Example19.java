import java.util.Scanner;

class Example19{
    public static void main(String[] args) {
        double price, discount ,total;
        Scanner intputValue = new Scanner(System.in);
        System.out.println("Write the price: ");
        price = intputValue.nextDouble();

        if (price < 6) {
            discount = 0;
        } else {
            if (price > 60) {
                discount = price * 0.05;
            }else{
                discount = price * 0.1;
            }
        }
        total = price - discount;
        System.out.println("The final price is : " + total);
    }
}
