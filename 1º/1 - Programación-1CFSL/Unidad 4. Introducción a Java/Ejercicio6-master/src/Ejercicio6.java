import java.util.Scanner;

//Desarrolla un algoritmo que lea 10
//números introducidos desde el teclado.
//Guárdalos en un array. Luego, invierte el
//array e imprímelo en orden normal.
public class Ejercicio6 {
    public static void main(String[] args) {
        int n,tmp;
        Scanner inputValue = new Scanner(System.in);
        int [] myArray;
        myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            n = inputValue.nextInt();
            myArray[i] = n;
        }
        //Invert the Array
        for (int i = 0; i < myArray.length / 2; i++) {
            tmp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length-1-i]=tmp;
        }
        for (int i = 0; i <= 9 ; i++) {
            System.out.println(myArray[i]);
        }
    }
}




