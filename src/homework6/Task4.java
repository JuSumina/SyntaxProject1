package homework6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an item you would like to buy");
        String itemToBuy=scanner.nextLine();
        System.out.println("Please enter the price of this item");
        double itemPrice=scanner.nextDouble();

        double money;
        double sum=0;


        do {
            System.out.println("Please enter the amount of money you can pay right now");
            money=scanner.nextDouble();
            sum= sum +money;
            if (sum<itemPrice) {
                System.out.println("You still owe " + (itemPrice - sum));
            } else {
                System.out.println("Your change is " + (sum - itemPrice));
                System.out.println("Your "+itemToBuy+ " is paid in full. Thank you for shopping");
                break;
            }
        } while (money<itemPrice);
        money++;

    }
}
