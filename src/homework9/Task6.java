package homework9;

public class Task6 {

    public static void main(String[] args) {

        String[][] countries = {{"USA", "Mexico"},
                {"Brazil", "Argentina", "Columbia", "Peru"},
                {"UK", "Spain", "Greece"},
                {"Japan", "China", "Singapore"},
                {"Kenya", "Ghana", "Morocco", "Mali"},
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++)
                System.out.print(countries[i][j] + " ");
            System.out.println();
        }

        int allCountries = 0;

        for (int i = 0; i<countries.length; i++) {
                allCountries=allCountries+countries[i].length;

            }
        System.out.println("The total number of countries printed above is "+allCountries);


    }
}