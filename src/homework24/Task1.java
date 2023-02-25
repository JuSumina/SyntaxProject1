package homework24;


import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {

        TreeSet <String> countries = new TreeSet<>();
        countries.add("Ukraine");
        countries.add("Poland");
        countries.add("Czech Republic");
        countries.add("Finland");
        countries.add("Netherlands");

        System.out.println(countries);

        for (String c:countries) {
            System.out.println(c);
        }
    }
}
