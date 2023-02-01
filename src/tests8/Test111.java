package tests8;

import java.util.Scanner;

public class Test111 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        for (int i=0; i<s.length(); i++ ) {
            System.out.print(s.charAt(i)+" ");
        }


    }
}
