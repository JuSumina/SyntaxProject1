package tests10;

import java.util.HashMap;
import java.util.Map;

public class Test189 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Remove :");

        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        map.replace("THREE","ASEL");
        map.replace("FIVE","SUMAIR");

        System.out.println("------------------");
        System.out.println("HashMap After Remove :");

        var iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()){
            var entry=iterator2.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
