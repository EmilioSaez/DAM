

import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        double nauticalMiles, meters;
        final double METERS_IN_NAUTICAL_MILES = 1852;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Tell me how many miles to trasnform them in meters");
        nauticalMiles = inputValue.nextDouble();
        meters = nauticalMiles * METERS_IN_NAUTICAL_MILES;
        System.out.println("the miles in meters are = " + meters);

    }
}
