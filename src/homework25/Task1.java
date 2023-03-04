package homework25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {

        Map<Integer, String> bestBuyMap = new HashMap<>();
        bestBuyMap.put (7664847, "Printer");
        bestBuyMap.put (7879885, "TV");
        bestBuyMap.put (7544894, "Monitor");
        bestBuyMap.put (7639223, "Laptop");
        bestBuyMap.put (7213785, "Speakers");

        Set<Map.Entry<Integer, String>> entrySet=bestBuyMap.entrySet();

        for (Map.Entry<Integer,String> entry:entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
