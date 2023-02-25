package tests10;

import java.util.ArrayList;
import java.util.Scanner;


public class Test171 {

    public static void main(String[] args) {

        ArrayList <Integer> a = new ArrayList<>();

        for (int i=0; i<5; i++) {
            Scanner scan=new Scanner(System.in);
            int num=scan.nextInt();
            a.add(num);

        }

        for (Integer numbers : a) {
            System.out.print(numbers + " ");
        }
    }
}
