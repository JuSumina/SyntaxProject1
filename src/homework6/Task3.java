package homework6;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=scanner.nextInt();
        System.out.println("Please enter second number");
        int num2=scanner.nextInt();

        int sumEven=0;
        int sumOdd=0;

        for ( int i=num1; i<=num2; i++) {
            System.out.println(i);
            if (i%2==0) {
                sumEven = sumEven +i;
            } else {
                sumOdd = sumOdd +i;
            }


        }
        System.out.println("The sum of even numbers is " + sumEven);
        System.out.println("The sum of odd numbers is " + sumOdd);


    }
}
