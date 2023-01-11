package homework3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");
        double num1 = input.nextDouble();

        System.out.println("Input second number");
        double num2 = input.nextDouble();

        System.out.println("Input third number");
        double num3 = input.nextDouble();

        if ((num1>num2) && (num1>num3)) {
            System.out.println(num1+" is the largest number");
        } else if ((num2>num1) && (num2>num3)) {
            System.out.println(num2+" is the largest number");
        } else {
            System.out.println(num3 + " is the largest number");
        }


    }
}
