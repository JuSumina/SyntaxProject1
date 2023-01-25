package homework12;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        String str="level";

        String reverseStr=new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            System.out.println(str+" is a palindrome");
        }
    }


    }

