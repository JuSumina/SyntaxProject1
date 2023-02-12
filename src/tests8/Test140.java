package tests8;

public class Test140 {

    String model;
    double price;
    int quantity;

    Test140 (String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public void carStockValue () {
       double stockValue=price*quantity;
        System.out.println(model+" Stock Value "+stockValue);
    }

    public static void main(String[] args) {

        Test140 car1 = new Test140("Toyota 2019", 25000, 100);
        car1.carStockValue();

        Test140 car2 = new Test140("BMW 2019", 65298, 10);
        car2.carStockValue();
    }
}
