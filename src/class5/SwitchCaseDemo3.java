package class5;

import java.util.Scanner;

public class SwitchCaseDemo3 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your gender f/F/m/M");
        char gender=scanner.next().charAt(0);

        switch (gender) {

            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("no specified");




        }



    }
}
