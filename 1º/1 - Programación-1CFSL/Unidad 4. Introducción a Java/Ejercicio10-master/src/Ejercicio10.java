
//Escribe un programa que calcule la moda (el
//elemento más frecuente) de una lista de 20
//caracteres. Inicializa el array de caracteres en la
//declaración del array como una lista de
//caracteres como esta.:
//final char[] LETTERS =
//{‘B', 'A', 'B', 'C', 'A', 'C', 'D', 'C', …, ’C’, 'D'};
public class Ejercicio10 {
    public static void main(String[] args) {
        int cont = 0, supCont = 0;
        final char[] LETTERS = {'A', 'B', 'A', 'C', 'Z', 'L', 'F', 'A', 'O', 'H', 'A', 'B', 'A', 'C', 'Z', 'L', 'F', 'A', 'O', 'H'};
        char letter = LETTERS[0];
        for (int i = 0; i < 20; i++) {
            cont = 0;
            for (int j = 0; j < 20; j++) {
                if (LETTERS[i] == LETTERS[j]) {
                    cont++;
                }
            }
            if (supCont < cont) {
                letter = LETTERS[i];
                supCont = cont;
            }
        }
        System.out.println("The letter: " + letter + " is picked : " + supCont + " times");
    }
}


