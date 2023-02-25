package homework23;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<>();

        names.add("Julia");
        names.add("Jessica");
        names.add("John");
        names.add("Joe");
        names.add("Jane");

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Joe"));

        System.out.println(names.size());
    }
}
