package tests10;

import java.util.HashSet;
import java.util.Set;

public class Test181 {

    public static void main(String[] args) {

        Set<String> values = new HashSet<>();
        values.add("first");
        values.add("second");
        values.add("third");

        System.out.println(values);

        values.clear();

        System.out.println(values);
    }
}
