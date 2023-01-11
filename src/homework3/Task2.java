package homework3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int day = 6;

        switch (day) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a weekday");
                break;
            case 6:
            case 7:
                System.out.println("It is a weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
