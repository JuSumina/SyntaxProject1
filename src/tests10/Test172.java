package tests10;

import java.util.ArrayList;
import java.util.Scanner;


public class Test172 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        Scanner scan = new Scanner (System.in);

        for(int j = 0; j<5; j++){
            a.add(scan.nextInt());
        }

        for (Integer numbers : a) {
            System.out.print(numbers + " ");
        }
    }
}
