package class7;

public class WhileLoop2 {

    public static void main(String[] args) {

        boolean workDay=true;
        int day = 1;

        while (workDay) {
            if (day<=5) {
                System.out.println("I need a day off");
            } else {
                System.out.println("I do not need a day off anymore");
                workDay = false;
            }
            System.out.println();
            day++;
        }
    }
}
