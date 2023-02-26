package class37;

import java.util.HashMap;
import java.util.Set;

public class Map4 {

    public static void main(String[] args) {

        HashMap<String, Double> makeup = new HashMap<>();
        makeup.put("lipstick", 50.0);
        makeup.put("foundation", 40.0);
        makeup.put("mascara", 70.0);
        makeup.put("eyeliner", 20.0);
        makeup.put("blush", 12.2);



        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

        /*for (String s:allKeys) {
            System.out.println(s);
        }*/

        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);







    }
}
