package class5;

import java.util.Scanner;

public class ScannerDemo1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);

        scan.nextLine();

        System.out.println("Please enter your name");
        String name=scan.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);

    }
}
