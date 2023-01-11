package tests3;

public class MyTest39 {

    public static void main(String[] args) {

        int limit = 5;

        int orders_made = 0;

        while (orders_made < limit) {
            orders_made++;
            int capacity = limit - orders_made;
            String message = capacity + "more tables can be ordered.";
            System.out.println(message);
        }
    }
}
