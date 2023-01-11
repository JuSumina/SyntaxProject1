package review2;

import java.util.Scanner;

public class ScannerReview {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age=keyboard.nextInt();

        System.out.println("Are you tired?");
        boolean tired=keyboard.nextBoolean();


        System.out.println("What is your name?");
        String name=keyboard.nextLine();

    }
}
