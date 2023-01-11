package homework2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("How many years did you work for?");
        int years=input.nextInt();

        System.out.println("What was your annual salary?");
        int salary=input.nextInt();

        if (years>=5) {
            System.out.println("You're eligible to receive a bonus!");

            if (salary > 50000) {
                System.out.println("Your bonus is 5000");
            } else {
                System.out.println("Your bonus is 3000");
            }
        } else {
            System.out.println("You are not eligible to receive a bonus");
        }
    }
}
