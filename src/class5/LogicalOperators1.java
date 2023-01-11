package class5;

public class LogicalOperators1 {

    public static void main(String[] args) {
        System.out.println(!true);
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);

        int number=9;

        if (number!=1) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello Java");
        }

        String country="China";

        if(!country.equals("BadCountry")) {
            System.out.println("You are welcome");
        }
    }
}
