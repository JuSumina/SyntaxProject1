package tests2;

import java.util.Scanner;

public class MyTest22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = scanner.nextBoolean();

        if (loan==true) {
            System.out.println("What is your credit score?");
            int creditSc = scanner.nextInt();
            if (creditSc < 600) {
                System.out.println("The eligibility is Not eligible");
            } else if (creditSc >= 600 && creditSc <= 700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (creditSc >= 701 && creditSc <= 800) {
                System.out.println("The eligibility is Eligible");
            } else {
                System.out.println("The eligibility is Definitely eligible");
            }

        } else {
            System.out.println("Unknown");
        }

    }
}
