package class13;

import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer=null;

        do {
            System.out.println("Do you understand loops in Java?");
            answer = scanner.nextLine();
        } while (!answer.equalsIgnoreCase("yes"));
    }
}
