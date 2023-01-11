package class6;

public class LogicalNotDemo {

    public static void main(String[] args) {

        String password="Pass123";
        if(!password.equals("Pass123")) {
            System.out.println("Wrong password");
        }

        boolean isRaining=true;

        if(!isRaining) {
            System.out.println("let's go for a walk");
        } else {
            System.out.println("let's take the umbrella");
        }
    }
}
