package homework3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

       Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height=scanner.nextInt();

        if (height<60){
            System.out.println("You are short");
        } else if (height>=60 && height<=72) {
            System.out.println("You are of medium height");
        } else {
            System.out.println("You are tall");
        }


    }
}
