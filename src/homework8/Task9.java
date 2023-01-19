package homework8;

import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {

        /*
        Write a program to find maximum and minimum number in the array?
         */

        int [] number = {5, 8, 12, 4, 20};

        Arrays.sort(number);
        for (int num : number) {

        }
        System.out.println("The minimum number in the array is "+number[0]);
        System.out.println("The maximum number in the array is "+number[number.length-1]);
    }
}
