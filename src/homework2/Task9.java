package homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");
        int num1 = input.nextInt();

        System.out.println("Input second number");
        int num2 = input.nextInt();

        System.out.println("Input third number");
        int num3 = input.nextInt();

        if (num1 > num2) {

            if (num1 > num3) {
                System.out.println(num1 + " is the largest number");
            } else if (num1<num3) {
                System.out.println(num3 + " is the largest number");
            }

        } else if (num2 > num3) {
            System.out.println(num2 + " is the largest number");

        } else {
            System.out.println(num3 + " is the largest number");
        }

    }
}
