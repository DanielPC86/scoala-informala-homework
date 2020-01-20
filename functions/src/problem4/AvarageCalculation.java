package problem4;

import java.util.Scanner;

public class AvarageCalculation {

    public static void main(String[] args) {

        System.out.println("Avarage of the array is: " + inputArray());
    }

    //Finding the avarage of an array
    public static int avarageOfArray(int[] array) {

        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }

        int avarage = total / array.length;

        return avarage;
    }
    public static int inputArray() {

        Scanner sc = new Scanner(System.in);
        //Asking the user for the length of the array
        System.out.println("Input the length of the array: ");

        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Input numbers");
        for (int i = 0; i < a.length; i++) {

            //Request to user to input a number, depending of the length of array
            a[i] = sc.nextInt();

        }
        //Calling the method for avarage
        int avarage = avarageOfArray(a);

        return avarage;
    }


}
