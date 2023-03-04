package tests10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test182 {

    public static void main(String[] args) {

        Set<String> colors = new LinkedHashSet<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");

        System.out.println("Original Hash Set: "+colors);
        System.out.println("Size of the Hash Set: "+colors.size());
    }
}
