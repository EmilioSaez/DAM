import java.util.Scanner;

//Desarrolla un algoritmo que lea 10
//números introducidos desde el teclado.
//Guárdalos en un array. Luego, muéstralos
//en orden inverso.
public class Ejercicio5 {
    public static void main(String[] args) {
        int n;
        Scanner inputValue = new Scanner(System.in);
        int[] myArray;
        System.out.println("write 10 numbers");
        myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            n = inputValue.nextInt();
            myArray[i] = n;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}
