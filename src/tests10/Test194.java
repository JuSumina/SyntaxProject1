package tests10;

import java.util.Map;
import java.util.TreeMap;

public class Test194 {

    public static void main(String[] args) {

        Map<String, String> fruit = new TreeMap<>();
        fruit.put("1 item", "apple");
        fruit.put("2 item", "banana");
        fruit.put("3 item", "pear");
        fruit.put("4 item", "tomato");
        fruit.put("5 item", "mango");
        fruit.put("6 item", "kiwi");

        var entrySet = fruit.entrySet();
        for (var entry: entrySet){
            System.out.println("Key is "+entry.getKey()+" and values is "+entry.getValue());
        }
    }
}
