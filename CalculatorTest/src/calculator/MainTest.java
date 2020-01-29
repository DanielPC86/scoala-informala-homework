package calculator;

public class MainTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(2, 5, -3);
        System.out.println("Max numbers is: " + calculator.getMax());
        System.out.println("Min number is: " + calculator.getMin());
        System.out.println("Sum of the three numbers is: " + calculator.getSum());
        System.out.println("Average of the three numbers is: " + calculator.getAvg());
        System.out.println("All numbers are positive? " + calculator.areAllPositive());
        System.out.println("Number is even? " + calculator.isAEven());
    }
}
