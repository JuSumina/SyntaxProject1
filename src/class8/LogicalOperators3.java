package class8;

public class LogicalOperators3 {

    public static void main(String[] args) {

        boolean dashboard=true;
        String message = "Welcome admin";

        if (dashboard || message.equals("Welcome admin")) {
            System.out.println("User is successfully logged in");
        } else {
            System.out.println("User is not logged in");
        }
    }
}
