package tests10;

import java.util.ArrayList;

public class Test169 {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("hi");
        a.add("yo");
        a.add("sup");
        a.add("yolo");
        a.add("boop");

        a.remove(4);
        a.remove(2);
        a.remove(0);

        for (String arr : a) {
            System.out.print(arr + " ");
        }

    }
}
