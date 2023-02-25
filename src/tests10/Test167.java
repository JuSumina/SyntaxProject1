package tests10;

import java.util.ArrayList;

public class Test167 {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(111);
        a.add(222);
        a.add(333);
        a.add(444);
        a.add(555);
        a.add(666);

        for (int i=0; i<a.size(); i++) {
            if (a.get(i)%2!=0) {
                System.out.println(a.get(i));
            }
        }
    }
}
