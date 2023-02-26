package class37;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map8 {

    public static void main(String[] args) {

        TreeMap <String, String> countries = new TreeMap<>();

        countries.put("Ukraine", "Kyiv");
        countries.put("USA", "Washington, D.C.");
        countries.put("Germany", "Berlin");
        countries.put("UK", "London");
        countries.put("France", "Paris");

        //countries.entrySet();
        //Set<Map.Entry<String, String>> entrySet=countries.entrySet();
        var entrySet=countries.entrySet();
        for (var entry:entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        var iterator=countries.entrySet().iterator();
        while(iterator.hasNext()) {
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        var values=countries.values();
        for (var value:values) {
            System.out.println(value);
        }
        




    }
}
