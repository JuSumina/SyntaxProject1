package tests10;

import java.util.*;

public class Test191 {

    public static void main(String[] args) {

        List<Map<String,Object>> dataList = new ArrayList<>();

        Map<String, Object> apple = new LinkedHashMap<>();
        apple.put ("Items", "Apple");
        apple.put ("Price", 20.00);
        apple.put ("Quantity", 10);

        dataList.add(apple);

        Map<String, Object> orange = new LinkedHashMap<>();
        orange.put ("Items", "Orange");
        orange.put ("Price", 21.99);
        orange.put ("Quantity", 10);

        dataList.add(orange);


        for(Map<String, Object> map: dataList) {
            String item = (String) map.get("Items");
            double price = (double) map.get("Price");
            double quantity = (int) map.get("Quantity");

            double subTotal = price * quantity;

            System.out.println("Items: "+item+" Price: "+price+" Quantity: "+quantity+" SubTotal: "+subTotal);
            System.out.println();
        }

        double totalPurchase = 0.0;
        for(Map<String, Object> map: dataList) {
            double price = (double) map.get("Price");
            double quantity = (int) map.get("Quantity");
            totalPurchase += price * quantity;
        }

        System.out.println("Your Purchase total : "+ totalPurchase);
    }
}
