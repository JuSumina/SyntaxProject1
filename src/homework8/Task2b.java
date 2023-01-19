package homework8;

import java.util.Scanner;

public class Task2b {

    public static void main(String[] args) {

        /*
        Using Scanner create an array of countries. When an array is created, retrieve all values
        from it and while retrieving those values print capital for each country.
        (use 2 different loops)
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 countries");
        String country1=scanner.nextLine();
        String country2=scanner.nextLine();
        String country3=scanner.nextLine();

        String [] country = { country1, country2, country3 };

        for (String countries:country) {
            System.out.println(countries);
        }




    }
}
