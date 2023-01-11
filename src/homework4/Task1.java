package homework4;

public class Task1 {

    public static void main(String[] args) {

        boolean workDay = true;
        int day = 1;

        while (workDay) {
            System.out.println("I need a day off");
            if(day == 5) {
                workDay=false;
                System.out.println("I do not need a day off any more");
            }
            day++;
        }

    }
}
