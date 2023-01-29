package tests6;

public class MyTest97 {

    public static void main(String[] args) {

        boolean myBoolean=true;
        char myChar='$';
        String myString="Julia";
        int myInt=50;
        double myDouble=1000;

        //System.out.printf("%b", myBoolean);
        //System.out.printf("%c", myChar);
        //System.out.printf("%s", myString);
        //System.out.printf("%d", myInt);
        //System.out.printf("%f", myDouble);

        System.out.printf("Hello %10s", myString);
        System.out.println();
        System.out.printf("You have this much money %.2f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %,.2f", myDouble);

    }
}
