package homework2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("What is your age?");
        int age=input.nextInt();

        if (age>=18) {
            System.out.println("We will issue a driver license");
        } else {
            System.out.println("We can offer you to get a learner's permit");
        }
    }
}
