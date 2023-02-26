package class37;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map6 {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put (1, "Julia");
        studentsMap.put (2, "Jane");
        studentsMap.put (3, "John");
        studentsMap.put (4, "Joe");
        studentsMap.put (5, "Jessica");

        Collection<String> values=studentsMap.values();
        System.out.println(values);
        values.removeIf(x -> x.contains("i"));
        System.out.println(values);



    }
}
