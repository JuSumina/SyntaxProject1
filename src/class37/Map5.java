package class37;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map5 {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put (1, "Julia");
        studentsMap.put (2, "Jane");
        studentsMap.put (3, "John");
        studentsMap.put (4, "Joe");

        Set<Integer> allKeys=studentsMap.keySet();
        System.out.println(allKeys);

        allKeys.removeIf(x->x>=2);
        System.out.println(allKeys);
        System.out.println(studentsMap);


    }
}
