package tests8;

import java.util.Scanner;

public class Test108 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        for (int i=s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }

    }
}
