import java.util.Scanner;
import static java.lang.Math.PI;
public class Example5 {

    public static void main(String[] args) {

        double radius , lenght, area;
        System.out.println("Dime el diametro de tu circumferencia para que pueda calcular el radio/longitud y area");
        Scanner intValue = new Scanner(System.in);
        radius = intValue.nextInt();
        lenght = PI * radius * 2;
        area = PI * radius * radius;

        System.out.println("El radio es  = " + radius + " la longitud es = " + lenght + " el area es = " + area);
    }
}
