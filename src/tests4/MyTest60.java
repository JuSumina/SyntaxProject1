package tests4;

import java.util.Scanner;

public class MyTest60 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int userNumber=scanner.nextInt();

        for (int i=userNumber-1; i>=0; i--) {
            System.out.println(i);

        }

    }
}
