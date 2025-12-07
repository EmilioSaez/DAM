import java.util.Scanner;

//Escribe un programa que lea un DNI (sin la letra) y luego calcule la letra,
//sabiendo que la letra se calcula de esta manera:
//Toma el DNI como un número y calcula el resto de la división entre 23, y
//asigna la letra en función del resto usando la siguiente tabla.
//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
//T R W A G M Y F P D X B N J Z S Q V H L C K E
public class Ejercicio7 {
    public static void main(String[] args) {
        int n, sNum;
        final char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Scanner inputValue = new Scanner(System.in);
        System.out.println("write ur DNI");
        n = inputValue.nextInt();
        sNum = n;
        n = n % 23;
        System.out.println(sNum + "" + LETTERS[n]);
    }
}

