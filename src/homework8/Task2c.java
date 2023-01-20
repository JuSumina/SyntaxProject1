package homework8;

import java.util.Scanner;

public class Task2c {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 countries out of the following 5: Brazil, Argentina, Columbia, Peru and Chile");
        String country1=scanner.nextLine();
        String country2=scanner.nextLine();
        String country3=scanner.nextLine();

        String [] country={"Brazil", "Argentina", "Columbia", "Peru", "Chile"};
        String [] capital = { "Brasília", "Buenos Aires", "Bogotá", "Lima", "Santiago" };

        for (int i=0; i<country.length; i++) {
            if (country1.equals(country[i])) {
                System.out.println("The capital of "+country[i]+" is "+capital[i]);
            }
            if (country2.equals(country[i])) {
                System.out.println("The capital of "+country[i]+" is "+capital[i]);
            }
            if (country3.equals(country[i])) {
                System.out.println("The capital of "+country[i]+" is "+capital[i]);
            }

        }

    }
}
