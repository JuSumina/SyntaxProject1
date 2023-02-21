package class34;



import java.util.ArrayList;

public class GenericArrayList1 {

    public static void main(String[] args) {

        ArrayList name = new ArrayList();

        name.add("Julia");
        name.add(10);
        name.add('a');

        for (Object j:name) {
            System.out.println(j);
        }
    }
}
