package class35;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(12);
        aList.add(13);
        aList.add(14);

        System.out.println(aList.size());
        System.out.println(aList.get(0));
        aList.set(0,120);

        int firstElement=aList.get(0);
        System.out.println(firstElement);

        aList.remove(2);
        System.out.println(aList);

    }
}
