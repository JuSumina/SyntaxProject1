package homework2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("What city do you live in?");
        String city=input.nextLine();

        System.out.println("What is the temperature in "+city+" right now?");
        double temp=input.nextDouble();

        double tempcel=(temp-32)*0.5556;
        int tempcelshort=(int)tempcel;

        System.out.println("The temperature in "+city+" is "+tempcelshort+"°C");

    }
}
