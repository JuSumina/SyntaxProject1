package homework8;

import java.util.Scanner;

public class Task2a {

    public static void main(String[] args) {

        /*
        Using Scanner create an array of countries. When an array is created, retrieve all values
        from it and while retrieving those values print capital for each country.
        (use 2 different loops)
         */

        Scanner scanner=new Scanner(System.in);
        /*System.out.println("Please pick 3 countries out 5 following countries: Brazil, Argentina, Columbia, Peru, Chile");
        String country1=scanner.nextLine();
        String country2=scanner.nextLine();
        String country3=scanner.nextLine();*/

        String [] country = { "Brazil", "Argentina", "Columbia", "Peru", "Chile"};
        String [] capital = { "Brasília", "Buenos Aires", "Bogotá", "Lima", "Santiago" };

        for (String countries:country) {
            System.out.print("Please pick 3 countries out 5 following countries: "+countries);
            String country1=scanner.nextLine();
            String country2=scanner.nextLine();
            String country3=scanner.nextLine();

            if (country1.equals(country[0])) {
                System.out.println("The capital of "+country1);
            }
        }




    }
}
