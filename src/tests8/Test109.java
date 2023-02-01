package tests8;

import java.util.Scanner;

public class Test109 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i=0; i<word.length(); i++ ) {
            if (i%2!=0) {
                continue;
            }
            System.out.print(word.charAt(i));
        }
    }
}
