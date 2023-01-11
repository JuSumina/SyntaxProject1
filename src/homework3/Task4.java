package homework3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What month were you born in");
        String month = scanner.nextLine();

        switch (month) {

            case "December":
            case "January":
            case "February":
                System.out.println("You were born in winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("You were born in spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("You were born in summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("You were born in autumn");
                break;
            default:
                System.out.println("Invalid input");


        }
    }
}
