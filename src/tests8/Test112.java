package tests8;

import java.util.Scanner;

public class Test112 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String [] names=new String [5];

        names [0] = scanner.nextLine();
        names [1] = scanner.nextLine();
        names [2] = scanner.nextLine();
        names [3] = scanner.nextLine();
        names [4] = scanner.nextLine();

        for (int i=0; i< names.length; i++) {
            System.out.println(names[i].substring(0,3));
        }

    }
}
