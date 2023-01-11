package tests;

import java.util.Scanner;

public class MyTests1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a grade");

        int n = scan.nextInt();

        if(n >=90 && n <=100) {
            System.out.println("A");
        } else if (n >=80 && n<=90) {
            System.out.println("B");
        } else if (n >=70 && n<=80) {
            System.out.println("C");
        } else if (n >=60 && n<=70) {
            System.out.println("D");
        } else {
            System.out.println("The number you entered is not in range");
        }



    }
}
