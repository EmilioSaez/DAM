//15.- Diseña un algoritmo que lea un valor numérico entero correspondiente a las notas de un
//examen y muestre su valor alfanumérico en español:
//• de 0 a <3 Muy Deficiente.
//• de 3 a <5 Insuficiente.
//• de 5 a <6 Suficiente.
//• de 6 a <7 Bien
//• de 7 a <9 Notable
//• de 9 a 10 Sobresaliente

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        float number;
        System.out.println("give me a number to classify it");
        Scanner intValue = new Scanner(System.in);
        number = intValue.nextFloat();

        if (number<0 || number>10) {
            System.out.println("ERROR");

        } else if (number < 3 && number > 0) {

            System.out.println("Muy Deficiente");
        } else if (number >= 3 && number < 5) {

            System.out.println("Insuficiente");
        } else if (number >= 5 && number < 6) {

            System.out.println("Suficiente");
        } else if (number >= 6 && number < 7) {

            System.out.println("Bien");
        } else if (number >= 7 && number < 9) {

            System.out.println("Notable");
        } else {

            System.out.println("Sobresaliente");
        }

    }
}
