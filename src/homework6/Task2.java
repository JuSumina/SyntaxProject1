package homework6;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        for (int request=0; request<10; request++) {
            System.out.println("Do you need a credit card?");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("yes")) {
                break;
            }

        }
    }
}
