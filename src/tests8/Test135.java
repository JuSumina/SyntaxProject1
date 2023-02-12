package tests8;

public class Test135 {

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Test135 (String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }

    Test135 (String make, String model, int topSpeed, double price) {
        this.make=make;
        this.model=model;
        this.numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;

    }

    Test135 (int numberOfDoors, int topSpeed, double price) {
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }

    Test135 (String make, String model, int numberOfDoors) {
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;

    }

    void display () {
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

    public static void main(String[] args) {

        Test135 car1 = new Test135("Toyota", "Prius", 4, 120, 30000.0);
        car1.display();

        Test135 car2 = new Test135("Toyota", "Prius", 120, 30000.0);
        car2.display();

        Test135 car3 = new Test135(4, 120, 30000.0);
        car3.display();

        Test135 car4 = new Test135("Toyota", "Prius", 4);
        car4.display();
    }
}
