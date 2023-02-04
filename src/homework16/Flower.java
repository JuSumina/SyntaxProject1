package homework16;

public class Flower {

    static String type;

    static String color;

    static void printF() {
        System.out.println("This " + type + " is " + color);

    }
}

    class Rose extends Flower {

        boolean prickles;

        void scratch() {
            if (prickles=true) {
                System.out.println("This rose can scratch you because it has prickles");
            } else {
                System.out.println("This rose can't scratch you because it doesn't have prickles");
            }
        }


    }

