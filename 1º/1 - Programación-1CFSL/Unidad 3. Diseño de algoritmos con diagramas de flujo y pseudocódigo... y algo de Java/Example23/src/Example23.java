//Ejemplo 23: Diseña un algoritmo que lea un conjunto de calificaciones desde el teclado hasta que
//se ingrese un -1 y escribe la calificación promedio y si hubo un 10 o no

import java.util.Scanner;

public class Example23 {
    public static void main(String[] args) {
        int number, i = 0, cont = 0, supNum = 0, average;
        boolean ten = false;
        Scanner inputValue = new Scanner(System.in);
        number = 0;
        System.out.println("Write number to calculate the average, and when u want to finish, write -1");
        while (number != -1) {
            number = inputValue.nextInt();
            if (number != -1) {
                supNum = supNum + number;
                cont++;
                if (number == 10) {
                    ten = true;
                }
            }
        }
        average = supNum / cont;
        System.out.println("the average is : " + average);
        if (ten) {
            System.out.println("There is a 10 in the notes");
        }


    }
}
