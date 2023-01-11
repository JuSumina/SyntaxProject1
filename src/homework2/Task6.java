package homework2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Do you have a credit card?");
        boolean cc=input.nextBoolean();


        if (cc) {
            System.out.println("What is the balance on your credit card?");
            int balance=input.nextInt();

            if (balance>1000) {
                System.out.println("Your balance is over 1000. You need to pay it off immediately");
            } else {
                System.out.println("You can spend more");
            }

        } else {
            System.out.println("Would you like to apply for a credit card?");
        }

    }
}
