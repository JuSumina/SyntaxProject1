package class6;

public class LogicalOrDemo {

    public static void main(String[] args) {

        String day="Monday";

        if (day.equalsIgnoreCase("Monday")|| day.equalsIgnoreCase("Friday")) {
            System.out.println("No class today");
        }
    }
}
