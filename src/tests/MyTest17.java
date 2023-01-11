package tests;

import java.util.Scanner;

public class MyTest17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String name = "";

        while (name.isBlank()){
            System.out.println("Eneter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+name);
    }
}
