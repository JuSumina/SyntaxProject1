package class37;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put ("Apple", 1.99);
        fruit.put ("Orange",2.99);
        fruit.put ("Banana", 0.79);
        fruit.put ("Kiwi", 3.99);
        fruit.put ("Apple", 3.99);
        fruit.put (null, null);

        System.out.println(fruit);

        HashMap<String, Double> makeup = new HashMap<>();
        makeup.put("lipstick", 50.0);
        makeup.put("foundation", 40.0);
        makeup.put("mascara", 70.0);
        makeup.put("eyeliner", 20.0);
        makeup.put("blush", 12.2);

        HashMap<String, Double> groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);



    }
}
