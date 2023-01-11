package tests2;

import java.util.Scanner;

public class MyTest25 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean weekend=scanner.nextBoolean();

        if (weekend==false) {
            System.out.println("Today you will be learning manual testing");
        } else {
            System.out.println("Today you will be learning Java");
        }
    }
}
