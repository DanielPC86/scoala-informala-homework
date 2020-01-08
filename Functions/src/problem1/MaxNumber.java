package problem1;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        System.out.println(maximum());
    }

    public static String maximum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number.");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("Enter third number");
        double c = sc.nextDouble();

        double max = Math.max(Math.max(a,b),c);

        return ("The max of three is: " + max);
    }
}
