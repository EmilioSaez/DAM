import java.sql.Array;
import java.util.Scanner;
public class MagicWord {
    public String[] words = {
            "nuget",
            "screen",
            "dog",
            "monkey",
            "laptop",
            "pneumonoultramicroscopicsilicovolcanoconiosis",//Sí, existe
            "potato",
            "diamond"};
    private String word;
    private Boolean[] correctLetters;

    public MagicWord() {
        int randomIndex = (int) (Math.random() * words.length);
        word = words[randomIndex];
        correctLetters = new Boolean[word.length()];
        for (int i = 0; i < word.length(); i++) {
            correctLetters[i] = false;

        }
    }
    public void checkLetterOrWord(String letterOrWord) {
        int contTrue = 0;
        if (letterOrWord.length() == 1) {
            for (int i = 0; i < word.length(); i++) {
                if (letterOrWord.charAt(0) == word.charAt(i)) {
                    correctLetters[i] = true;
                }
            }
        } else {

            for (int i = 0; i < word.length(); i++) {
                if (letterOrWord.charAt(i) == word.charAt(i)) {
                    contTrue++;
                }
            }
            if (contTrue == word.length()) {
                for (int i = 0; i < word.length(); i++) {
                    correctLetters[i] = true;
                }
            }
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < word.length(); i++) {
            if (correctLetters[i] == true) {
                s += word.charAt(i);
            } else {
                s += "_";
            }
        }
        return s;
    }

    public boolean isWinner() {
        int contCorrect = 0;
        for (int i = 0; i < word.length(); i++) {
            if (correctLetters[i] == true) {
                contCorrect++;
            }
        }
        if (contCorrect == word.length()) {
            return true;
        } else {
            return false;
        }
    }
}
