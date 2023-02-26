package class37;

import java.util.HashMap;
import java.util.Map;

public class Map3 {

    public static void main(String[] args) {

        Map<Integer, String> companies = new HashMap<>();
        companies.put(1, "Google");
        companies.put(2, "Syntax");
        companies.put(3, "Amazon");
        companies.put(4, "Twitter");
        companies.put(5, "Facebook");
        companies.put(6, "IBM");
        companies.put(7, "Microsoft");

        System.out.println(companies.size());
        companies.replace(4, "Shell");
        companies.remove(7);
        System.out.println(companies);


    }
}
