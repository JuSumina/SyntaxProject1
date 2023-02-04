package class23;

public class Furniture {

    String type;
    double price;
    String color;

    Furniture (String type, double price, String color) {
        this.type=type;
        this.price=price;
        this.color=color;


    }
    void print() {
        System.out.println(type+"'s price is "+price+" and color is "+color);
    }
}
