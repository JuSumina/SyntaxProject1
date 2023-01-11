package tests;

import java.util.Scanner;

public class MyTest15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter any number");
        int num = input.nextInt();

        if (num%2==0) {
            System.out.println("Value is even");

            if (num>1000) {
                System.out.println("Even value is large");
            } else {
                System.out.println("Even value is just right");
            }
        } else {
            System.out.println("Value is odd");

            if (num>1000) {
                System.out.println("Odd value is large");
            } else {
                System.out.println("Odd value is just right");
            }
        }


    }
}
