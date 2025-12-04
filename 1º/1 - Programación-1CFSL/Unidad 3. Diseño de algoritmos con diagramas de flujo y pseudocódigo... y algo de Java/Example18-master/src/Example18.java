import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {
        double numHours, taxes, hourPrice, grossPay, netPay, extraHours;
        System.out.println("Write the hours worked, and how many money are the hour payed");
        Scanner intValue = new Scanner(System.in);
        numHours = intValue.nextDouble();
        hourPrice = intValue.nextDouble();
        if (numHours <= 35) {
            grossPay = numHours * hourPrice;
        } else {
            extraHours = (numHours - 35);
            grossPay = 35 * hourPrice + extraHours * hourPrice * 1.5;

        }
        if (grossPay >= 900) {
            taxes = (grossPay - 900)*0.45 + 400 * 0.25 ;
            netPay = grossPay - taxes;

        } else if(grossPay <=900 && grossPay>=500) {

            taxes = (grossPay - 500) * 0.25;
            netPay = grossPay - taxes;
        }else {
            netPay = grossPay;
            taxes = 0;
        }
        System.out.println("net pay  " + netPay + "  grossPay   " + " " + grossPay + " Taxes  " + taxes);
    }

}