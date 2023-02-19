package homework22;

public class CarTest {

    public static void main(String[] args) {

        Sedan sedan = new Sedan (60000, "black", 15);
        System.out.println(sedan.calculateSalePrice());

        Truck truck = new Truck (90000,"matt grey", 2250);
        System.out.println(truck.calculateSalePrice());

    }
}
