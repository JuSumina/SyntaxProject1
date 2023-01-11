package homework3;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What country are you from?");
        String country=scanner.nextLine();

        switch (country) {
            case "USA":
                System.out.println("You speak English");
                break;
            case "Italy":
                System.out.println("You speak Italian");
                break;
            case "France":
                System.out.println("You speak French");
                break;
            case "Lebanon":
                System.out.println("You speak Arabic");
                break;
            case "Ukraine":
                System.out.println("You speak Ukrainian");
                break;
            default:
                System.out.println("Wrong country");


        }
    }
}
