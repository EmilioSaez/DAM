import java.util.Scanner;
class Example16 {
    public static void main(String[] argv) {
        int grade;
        System.out.println("Enter a number from 1 to 10:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        grade = inputValue.nextInt();
        switch(grade) {
            case 1: System.out.println("one");
                break;
            case 2: System.out.println("two");
                break;
            case 3: System.out.println("three");
                break;
            case 4: System.out.println("four");
                break;
            case 5: System.out.println("five");
                break;
            case 6: System.out.println("six");
                break;
            case 7: System.out.println("seven");
                break;
            case 8: System.out.println("eight");
                break;
            case 9: System.out.println("nine");
                break;
            case 10: System.out.println("ten");
                break;
            default: System.out.println("ERROR");
        }
    }
} 