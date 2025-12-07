public class Dni {
    private int number;
    private char letter;
    private static final char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Dni() {

    }

    public Dni(int n, char c) {
        int letterNum;
        this.number = n;
        this.letter = Character.toUpperCase(c);
        letterNum = number % 23;
        if (c != LETTERS[letterNum]) {
            this.number = n * -1;
        }
    }

    public Dni(int n) {
        this.number = n;
        if (number<0){
            letter=LETTERS[-1*number%23];
        }

    }

    public Dni(String dni) { //Por si pone DNI+Letra todo junto
        int letterNum;
        letterNum = number % 23;
        if (dni == null || dni.trim().isEmpty()) {
            number = -1;
        } else {
            String dniLimpio = dni.replaceAll("[^0-9]", "");
            number = Integer.parseInt(dniLimpio);
        }

        this.letter = dni.charAt(dni.length() - 1);
        if (this.letter!= LETTERS[number%23]){
            number=number*-1;

        }
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }

    public void setNumber(int dni) {
        this.number=dni;
        char correctLetter = LETTERS[number%23];
        if (letter != correctLetter){
            this.number = -number;
        }



        }
    public String toFormatString(){

        return String.format("%,d",number)+"-"+letter;
    }

    public String toString() {
        return number + "" + letter;
    }

    public Boolean CorrecDni() {
        boolean correct = true;
        if (number < 0) {
            correct = false;
        }
        return correct;
    }
    public static char letterForDni( int number){
        int nLetter;
        nLetter = number % 23;
        return LETTERS[nLetter];
    }
    public static String NifForDni(int number){
        Dni dni = new Dni(number);
        return dni.toString();
    }


}
