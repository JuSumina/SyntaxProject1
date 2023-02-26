package class37;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map7 {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put (1, "Julia");
        studentsMap.put (2, "Jane");
        studentsMap.put (3, "John");
        studentsMap.put (4, "Joe");
        studentsMap.put (5, "Jessica");

        Set<Map.Entry<Integer, String>> entrySet=studentsMap.entrySet();

        for (Map.Entry<Integer,String> entry:entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        entrySet.removeIf(x -> x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(studentsMap);






    }
}
