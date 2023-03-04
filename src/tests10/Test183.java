package tests10;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test183 {

    public static void main(String[] args) {

        Set<String> continents = new TreeSet<>();
        continents.add("India");
        continents.add("Australia");
        continents.add("South Africa");
        continents.add("India");
        continents.add("America");
        continents.add("America");

        System.out.println(continents);

    }
}
