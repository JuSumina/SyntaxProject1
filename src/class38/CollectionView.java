package class38;

import java.util.*;

public class CollectionView {

    public static void main(String[] args) {

        Map<String,Double> grocery = new LinkedHashMap<>();
        grocery.put("Milk",5.99);
        grocery.put("Banana",0.79);
        grocery.put("Eggs",6.50);
        grocery.put("Bread",2.99);
        grocery.put("Butter",4.59);

        Set<String> keys = grocery.keySet();
        for (String key: keys) {
            System.out.println(key+" "+grocery.get(key));
        }

        Iterator<String> iterator=keys.iterator();
        while(iterator.hasNext()) {
            String k= iterator.next();
            System.out.print(k+" "+grocery.get(k));

        }

        System.out.println();

        Collection<Double> values= grocery.values();

        for (Double value:values) {
            System.out.println(value);
        }
    }
}
