package tests2;

import java.util.Scanner;

public class MyTest31 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carmake=scanner.nextLine();

        switch (carmake) {
            case "BMW":
                System.out.println("Your favorite car is german car");
                break;
            case "Toyota":
                System.out.println("Your favorite car is japanese car");
                break;
            case "Maserati":
                System.out.println("Your favorite car is italian car");
                break;
            default:
                System.out.println("unknown");
        }

    }
}
