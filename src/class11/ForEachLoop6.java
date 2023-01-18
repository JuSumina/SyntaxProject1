package class11;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter 5 numbers");

        int [] numbers=new int [5];

        numbers [0] = scanner.nextInt();
        numbers [1] = scanner.nextInt();
        numbers [2] = scanner.nextInt();
        numbers [3] = scanner.nextInt();
        numbers [4] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));




    }
}
