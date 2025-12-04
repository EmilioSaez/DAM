public class Example22 {
    public static void main(String[] args) {
        int product = 1, sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + 1;
            product = product * i;
        }
        System.out.println("Sum from 1 to 10 : " + sum);
        System.out.println("Product from 1 to 10 : " + product);
    }
}