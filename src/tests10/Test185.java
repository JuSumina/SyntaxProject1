package tests10;

import java.util.*;

public class Test185 {
    public static void main(String[] args) {

        Map<String, String> address = new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        var iterator=address.entrySet().iterator();
        while(iterator.hasNext()) {
            var entry=iterator.next();
            System.out.println(entry.getValue());
        }
    }
}
