package problem1;

import java.util.Scanner;

public class CalculateMax {

    public static void main(String[] args) {

        System.out.println("Max of three numbers is " + consoleNumbers());
    }

    //Formula for finding a maximum in an array
    public static int getMax(int[] numbers) {

        int maxValue = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > maxValue)
                maxValue = numbers[i];

        return maxValue;
    }

    //Reading three numbers from console
    public static int consoleNumbers() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();

        System.out.println("Enter a second number");
        int b = sc.nextInt();

        System.out.println("Enter a third number");
        int c = sc.nextInt();

        //Pushing the numbers in an array
        int[] threeNumbers = {a, b, c};

        int maxValue = getMax(threeNumbers);

        return maxValue;
    }
}
