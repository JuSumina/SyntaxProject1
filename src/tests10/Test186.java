package tests10;

import java.util.HashMap;
import java.util.Map;

public class Test186 {

    public static void main(String[] args) {

        Map<String, String> address = new HashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        var entrySet=address.entrySet();
        for (var entry:entrySet) {
            System.out.println(entry.getValue().toUpperCase());
        }
    }
}
