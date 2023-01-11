package tests2;

import java.util.Scanner;

public class MyTest26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int mark = scanner.nextInt();

        if (mark>=1 && mark<25) {
            System.out.println("Your grade is F");
        } else if (mark>=25 && mark<45) {
            System.out.println("Your grade is E");
        } else if (mark>=45 && mark<50) {
            System.out.println("Your grade is D");
        } else if (mark>=50 && mark<60) {
            System.out.println("Your grade is C");
        } else if (mark>=60 && mark<80) {
            System.out.println("Your grade is B");
        } else if (mark>80){
            System.out.println("Your grade is A");
        } else {
            System.out.println("Please enter valid mark");
        }
    }
}
