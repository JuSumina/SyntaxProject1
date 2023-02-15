package class30;

interface Washable {
    void wash();
}

public class SmartWatch implements Washable {
    public void wash() {
        System.out.println("I am IP65 Rated, you can wash me");
    }
}

class Phone implements Washable {

    public void wash() {
        System.out.println("I am IP65 Rated, you can wash me");
    }

}

class Inverter implements Washable {
    public void wash() {
        System.out.println("I am IP65 Rated, you can wash me");
    }
}

