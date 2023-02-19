package homework22;

public class Car {

    double carPrice;
    String carColor;

    Car (double carPrice, String carColor) {
        this.carPrice=carPrice;
        this.carColor=carColor;

    }

    double calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car {

    int length;
    public Sedan(double carPrice, String carColor, int length) {
        super(carPrice, carColor);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if (length>20) {
            return carPrice*0.95;
        } else {
            return carPrice*0.9;
        }
    }
}

class Truck extends Car {

    double weight;
    public Truck(double carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight>2000) {
            return carPrice*0.90;
        } else {
            return carPrice*0.8;
        }
    }
}
