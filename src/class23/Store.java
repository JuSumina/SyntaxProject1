package class23;

public class Store {

    public static void main(String[] args) {

        Furniture chair=new Furniture("chair", 200, "black");
        chair.print();

        Furniture table=new Furniture ("table", 400, "natural brown");
        table.print();
    }
}
