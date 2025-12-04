import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        float side;
        float squareArea;
        System.out.println("Dime el lado del cuadrado");

        Scanner inputValue;
        inputValue = new Scanner(System.in); //.in sirve para el teclado
        side = inputValue.nextFloat();
        squareArea = side * side;
        System.out.println(squareArea + " centrimetos mide el area");

    }
}
