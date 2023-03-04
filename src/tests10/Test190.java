package tests10;

import java.util.HashMap;
import java.util.Map;

public class Test190 {

    public void display (Map<String,Integer> map) {
        if (!map.isEmpty()) {
            var entrySet=map.entrySet();
            for (var entry:entrySet) {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        } else {
            System.out.println("map is empty");
        }

    }

    public static void main(String[] args) {

        Test190 fruitMap = new Test190();

        Map<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        fruitMap.display(map);

        map.clear();

        fruitMap.display(map);
    }
}
