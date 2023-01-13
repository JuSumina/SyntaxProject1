package class8;

import java.util.Scanner;

public class WhileLoop2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you tired?");

        boolean tired=scanner.nextBoolean();

        while(!tired) {

            System.out.println("This is great");
            System.out.println("Let's study Java");
            System.out.println("Are you tired?");
            tired=scanner.nextBoolean();

        }
    }
}
