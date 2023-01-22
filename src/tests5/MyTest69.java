package tests5;

import java.util.Scanner;

public class MyTest69 {

    public static void main(String[] args) {

        int [] arr = new int [5];

        Scanner scanner = new Scanner(System.in);


        arr[0]=scanner.nextInt();
        arr[1]=scanner.nextInt();
        arr[2]=scanner.nextInt();
        arr[3]=scanner.nextInt();
        arr[4]=scanner.nextInt();

        for (int i=4; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
