package problem2;

import java.util.Scanner;

public class BodyTemperatureMeasure {

    public static void main(String[] args) {

        System.out.println(bodyTemperature());
    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        //Formula for converting fahrenheit in celsius degrees
        double celsius = ((5 * (fahrenheit - 32)) / 9);

        return celsius;
    }

    public static String bodyTemperature() {

        //Asking user for body temperature
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your body temperature");
        double x = sc.nextDouble();

        x = fahrenheitToCelsius(x);

        //Checking if the temperature inputed, is in healthy parameters
        if (x < 37)
            return ("Your body temperature in Celsius is: " + x);
        else
            return ("You are ill!");
    }
}
