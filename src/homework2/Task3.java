package homework2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("How much do you plan to lend?");
        int loan=input.nextInt();

        if (loan<=200000) {
            System.out.println("Congratulations! We will lend you the money");
        } else {
            System.out.println("Unfortunately, we will have to reject you");
        }
    }
}
