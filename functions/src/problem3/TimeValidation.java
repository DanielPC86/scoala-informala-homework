package problem3;

import java.util.Scanner;

public class TimeValidation {

    public static void main(String[] args) {

        System.out.println(validation());

    }

    //Asking the user, what time is it
    public static int[] findTime() {

        Scanner sc = new Scanner(System.in);
        System.out.println("What time is it?");
        int hour = sc.nextInt();
        int min = sc.nextInt();

        return new int[] {hour, min};
    }

    //Checking if the hour generated by the user, is valid
    public static String validation() {

        int time[] = findTime();

        if ((time[0] < 0) || (time[0] > 24) || (time[1] < 0) || (time[1] > 59))
            return ("Incorrect time!");

        else
            return ("The time is " + time[0] + ":" + time[1] + " now.");
    }
}
