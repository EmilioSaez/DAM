import java.util.Scanner;

//34.- Calcula el valor e utilizando la serie de Newton. Los datos de entrada son un número n. Usa un
//valor como 10 para el infinito (prueba con varios números):
public class Example34 {
    public static void main(String[] args) {
        double n = 1, nSup = 0, operation = 1;
        for (int i = 1; i < 10; i++) {
            n = i * n;
            nSup = n;
            operation = operation + 1 / nSup;
        }
        System.out.println(operation);
    }
}
