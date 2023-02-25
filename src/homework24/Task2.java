package homework24;

import java.util.LinkedHashSet;

public class Task2 {

    public static void main(String[] args) {

        LinkedHashSet <String> cities = new LinkedHashSet<>();
        cities.add("Kyiv");
        cities.add("Barcelona");
        cities.add("Athens");
        cities.add("Albany");
        cities.add("Tokyo");

        cities.removeIf(c -> c.startsWith("A"));
        System.out.println(cities);

    }
}
