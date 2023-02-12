package tests8;

public class Test136 {

    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    Test136 (String label, double price, String category, boolean hasExpiration, int stock) {
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }

    Test136 (String label, double price, int stock) {
        this(label, price, "misc", false, stock);
    }

    Test136 (String label, double price) {
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=0;
    }

    void display () {
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }

    public static void main(String[] args) {

        Test136 product1 = new Test136("Eggs", 3, "Produce", true, 10);
        product1.display();

        Test136 product2 = new Test136("Paper Towels", 2, 24);
        product2.display();

        Test136 product3 = new Test136("Paper Towels", 2);
        product3.display();
    }
}
