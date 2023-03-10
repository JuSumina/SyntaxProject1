package class27;

public class Car {
    public String make;
    String model;
    int year, horsePower;

    public Car (String make, String model) {
        this.make=make;
        this.model=model;
    }

    public Car (String make, String model, int year, int horsePower) {
        this(make, model);
        this.year=year;
        this.horsePower=horsePower;

    }

    public void start () {
        System.out.println(make+" starts");
    }

    public void drive (int speed) {
        System.out.println(make+" drives at "+speed+" miles per hour");
    }

    void drive (String destination) {
        System.out.println(make+" drives to "+destination);
    }

    void drive (int speed, String destination) {
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }

    public void drive (String destination, int speed) {
        System.out.println(make+" drive to "+destination+" with speed = "+speed);
    }

    
}
