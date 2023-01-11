package tests2;

import java.util.Scanner;

public class MyTest24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty = scanner.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy = scanner.nextBoolean();

        if (thirsty == true && sleepy == false) {
            System.out.println("Looks like you need to drink water");
        } else if (thirsty == true && sleepy == true) {
            System.out.println("Looks like you need to drink coffee");
        } else if (thirsty == false && sleepy == true) {
            System.out.println("Looks like you need to drink tea");
        } else {
            System.out.println("Looks like you need to drink nothing");
        }

    }
}
