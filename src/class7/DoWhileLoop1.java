package class7;

import java.util.Scanner;

public class DoWhileLoop1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println( "please enter a number");
            number=scanner.nextInt();
        } while (number!=5);
    }
}
