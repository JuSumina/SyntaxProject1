package tests8;

public class Test141 {

    String item;
    double price;
    int quantity;

    public Test141 (String item, double price, int quantity) {
        this.item=item;
        this.price = price;
        this.quantity = quantity;
    }

    public double itemTotalPrice() {
        double totalValue = price * quantity;
        System.out.println(item + " Total Value " + totalValue);
        return totalValue;
    }

    public static void main(String[] args) {

        Test141 item1=new Test141("Blanket", 49.99, 2);
        double item1TotalValue = item1.itemTotalPrice();

        Test141 item2 = new Test141("Mattress", 219.59, 2);
        double item2TotalValue = item2.itemTotalPrice();

        double totalPurchaseValue = item1TotalValue + item2TotalValue;
        System.out.println("You purchased " + totalPurchaseValue + " Today");
    }
}
