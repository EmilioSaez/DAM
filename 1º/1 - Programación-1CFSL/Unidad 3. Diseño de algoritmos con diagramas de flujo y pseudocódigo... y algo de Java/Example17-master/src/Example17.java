//Diseña un algoritmo que reciba horas, minutos y segundos y muestre las horas, minutos y
//segundos resultantes de añadir un segundo
import java.util.Scanner;

public class Example17 {

        public static void main(String[] args) {
            int h,m,s;
            System.out.println("Write hours, minutes and seconds");
            Scanner intValue = new Scanner(System.in);
            h = intValue.nextInt();
            m = intValue.nextInt();
            s = intValue.nextInt();
            s++;
            if (s >= 60) {
                s= 0;
                m++;
            }
            if (m >= 60) {
                m= 0;
                h++;
            }
            System.out.println("The time is :"+h+ " "+ m + " "+ s);

        }
    }


