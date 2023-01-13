package class8;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favourite browser");
        String browser=scanner.nextLine();

        switch (browser.toLowerCase()) {
            case "Chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "Safari":
                System.out.println("Test case executed in "+browser);
                break;
            case "Firefox":
                System.out.println("Test case executed in "+browser);
                break;
            case "Opera":
                System.out.println("Test case executed in "+browser);
                break;
            case "Microsoft Word":
                System.out.println("Test case executed in "+browser);
                break;
            default:
                System.out.println("Browser is unknown - no execution");
        }
    }
}
