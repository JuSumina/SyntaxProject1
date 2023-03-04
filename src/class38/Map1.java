package class38;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {

    public static void main(String[] args) {

        Map<String,Double> grocery = new HashMap<>();
        grocery.put("Milk",5.99);
        grocery.put("Banana",0.79);
        grocery.put("Eggs",6.50);
        grocery.put("Bread",2.99);
        grocery.put("Butter",4.59);

        double breadPrice = grocery.get("Bread");
        System.out.println(breadPrice);

        int size = grocery.size();
        System.out.println("Number of entry is "+size);

        Map <String,Double> gMap=new LinkedHashMap<>();
        gMap.put("Milk",5.99);
        gMap.put("Banana",0.79);
        gMap.put("Eggs",6.50);
        gMap.put("Bread",2.99);
        gMap.put("Butter",4.59);

        System.out.println("LinkedHashMap Order: "+gMap);

        Map <String,Double> tMap=new TreeMap<>();
        tMap.putAll(grocery);
        tMap.putAll(gMap);
        System.out.println(tMap.size());

    }
}
