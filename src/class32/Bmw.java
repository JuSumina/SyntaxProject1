package class32;

import class27.Car;

public class Bmw extends Car {
    public Bmw(String make, String model) {
        super(make, model);
    }

    public Bmw(String make, String model, int year, int horsePower) {
        super(make, model, year, horsePower);
    }

    public void start () {
        System.out.println(make+"starts with push start button");

    }

    String drive (String typeOfDriving) {
        System.out.println(make+" drives "+typeOfDriving);
        return typeOfDriving;
    }

    void brake() {
        System.out.println(make+" brakes");
    }
}
