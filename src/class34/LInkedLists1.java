package class34;

import java.util.LinkedList;

public class LInkedLists1 {

    public static void main(String[] args) {

        LinkedList <String> names=new LinkedList<>();
        names.add("Julia");
        names.add("Jennifer");
        names.add("John");
        names.add("Joe");
        names.add("Josh");
        System.out.println(names);

        for (String name:names) {
            System.out.println(name);
        }



    }
}
