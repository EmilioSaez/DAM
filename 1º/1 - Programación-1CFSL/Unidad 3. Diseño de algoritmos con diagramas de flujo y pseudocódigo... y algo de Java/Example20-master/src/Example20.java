//20.- Diseña un algoritmo que lea un año como datos de entrada y muestre si es un año
//bisiesto. Todos los múltiplos de 4, excepto los que son múltiplos de 100 y no de 400 son
//años bisiestos. (Ej. Años bisiestos: 1600, 2000, 2400. No bisiestos: 1700, 1800, 1900...

import java.util.Scanner;

public class Example20 {
    public static void main(String[] args) {
        int year;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Write a year");
        year = inputValue.nextInt();

        if (year % 4 == 0 && !(year % 100 == 0 && !(year % 400 == 0))) {
            System.out.println("the year is leap");
        } else {
            System.out.println("The year isn't leap");
        }
    }
}

