package class33;

import java.util.ArrayList;

public class ArrayList4 {

    public static void main(String[] args) {

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);

        System.out.println(booleans.get(0));
        System.out.println(booleans.get(4));

        for (int i=0; i< booleans.size(); i++) {
            System.out.println(booleans.get(i));
        }

        int j=0;
        while (j< booleans.size()) {
            System.out.println(booleans.get(j)
            );
            j++;
        }

        int k=0;
        do {
            System.out.println(booleans.get(k));
            k++;
        } while (j< booleans.size());


    }
}
