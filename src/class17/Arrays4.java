package class17;

import java.util.Scanner;

public class Arrays4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many names you want to store?");
        int size=scanner.nextInt();

        String [] name=new String[size];

        for (int i=0; i<name.length; i++) {
            System.out.println("Please enter your name");
            name[i]=scanner.next();
        }
        for (String names:name) {
            System.out.println(names);
        }




    }
}
