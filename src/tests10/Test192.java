package tests10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test192 {
    public static void main(String[] args) {

        Map<String, String> address = new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        var entrySet=address.values();
        for (var entry:entrySet) {
            System.out.println(entry);
        }
    }
}
