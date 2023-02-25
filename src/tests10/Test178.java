package tests10;

import java.util.LinkedList;
import java.util.List;

public class Test178 {

    public String removeA (List<String> countries) {
        countries.removeIf(c -> c.startsWith("A"));
        return countries.toString();
    }

    public static void main(String[] args) {

        Test178 md=new Test178();

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        System.out.println(md.removeA(countries));
    }
}
