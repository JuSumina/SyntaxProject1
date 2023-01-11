package tests;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyTest3 {
    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("guess the password: ");

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        System.out.println(password.equals(guess));

        if(password.equals(guess))
        {
            System.out.println("You're correct");
        } else if ("don't stop".equals(guess))
        {
            System.out.println("You got the second password");
        }else
        {
            System.out.println("This is false");
        }

    }
}
