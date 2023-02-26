package class37;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put (1, "Julia");
        studentsMap.put (2, "Jane");
        studentsMap.put (3, "John");
        studentsMap.put (4, "Joe");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("John"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);


    }
}
