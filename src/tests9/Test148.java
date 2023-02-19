package tests9;

public class Test148 {

    String city;

    Test148 (String city) {
        this.city=city;
    }

    public void display () {
        System.out.println("City name "+city);
    }

    public static void main(String[] args) {

        Child2 c = new Child2("Fairfax");
        c.display();

    }

}

class Child2 extends Test148 {
    public Child2(String city) {
        super(city);
    }
}
