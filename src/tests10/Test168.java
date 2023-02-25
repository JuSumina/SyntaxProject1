package tests10;

import java.util.ArrayList;

public class Test168 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(111);
        a.add(111);
        a.add(111);
        a.add(999);
        a.add(999);
        a.add(999);

        for (Integer array:a) {
            System.out.println(array);
        }
    }
}
