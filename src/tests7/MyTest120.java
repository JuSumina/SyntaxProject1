package tests7;

public class MyTest120 {

    int hours;
    int minutes;

    MyTest120 (int clockHours, int clockMinutes) {
        hours=clockHours;
        minutes=clockMinutes;
    }

    void printTime () {

        System.out.println(hours+":"+minutes);

    }

    public static void main(String[] args) {

        MyTest120 clock = new MyTest120(11,30);
        clock.printTime();
    }
}
