package tests8;

import java.util.Scanner;

public class Test107 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below

        boolean isPalindrome=true;

        StringBuilder newString=new StringBuilder(givenString);
        newString.reverse();
        String reversedStr=newString.toString();
        if(givenString.equalsIgnoreCase(reversedStr)) {
            System.out.println(isPalindrome);
        } else {
            System.out.println(isPalindrome=false);
        }

    }
}
