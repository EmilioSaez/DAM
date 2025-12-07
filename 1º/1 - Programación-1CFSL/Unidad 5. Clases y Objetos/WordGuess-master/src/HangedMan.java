import java.util.Scanner;
public class HangedMan {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        MagicWord magicWord = new MagicWord();
        boolean gameover = false;
        String letterOrWord;
        int cont=0;
        System.out.println("-The HangedMan-");
        System.out.println("Write letters to reveal the mysterious word, or a word to try to guess");
        while (gameover==false){
            letterOrWord = inputValue.next().toLowerCase();
            cont++;
            magicWord.checkLetterOrWord(letterOrWord);
            System.out.println(magicWord);
            System.out.println("You have done:  "+cont+" attempts");
            if (magicWord.isWinner()==true){
                System.out.println("You Win!!!!");
                gameover=!gameover;
            }
        }
    }
}
