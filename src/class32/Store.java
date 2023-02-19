package class32;

public class Store {

    public static void main(String[] args) {

        Furniture chair=new Chair();

        chair.assemble();
        chair.comfort();

        Furniture table = new Table();
        table.assemble();
        table.comfort();

        Chair.breaks();
        Furniture.breaks();
    }
}
