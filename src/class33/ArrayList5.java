package class33;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Julia");
        names.add("Jane");
        names.add("John");
        names.add("Joe");

        System.out.println(names.contains("John"));
        System.out.println(names);
        names.remove("Joe");
        System.out.println(names);
        names.set(3,"Jessica");
        System.out.println(names);
        System.out.println(names.indexOf("Julia"));


    }
}
