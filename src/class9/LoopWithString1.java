package class9;

import java.util.Scanner;

public class LoopWithString1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");


        while(scanner.next().equalsIgnoreCase("Sha")) {
            System.out.println("Great student who always wants an example with String in loop");
        }
    }
}
