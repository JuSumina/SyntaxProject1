package homework9;

public class Task6b {

    public static void main(String[] args) {

        String[][] countries = {{"USA", "Mexico"},
                {"Brazil", "Argentina", "Columbia", "Peru"},
                {"UK", "Spain", "Greece"},
                {"Japan", "China", "Singapore"},
                {"Kenya", "Ghana", "Morocco", "Mali"},
        };

        int allCountries = 0;

        for (String[] country: countries) {
            for (String s:country) {
                System.out.print(s+" ");
                allCountries++;
            }
            System.out.println();
        }

        System.out.println("The total number of countries printed above is "+allCountries);



    }
}