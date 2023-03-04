package homework25;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PersonTester {

    public static void main(String[] args) {

        Map<Integer, Person> personMap = new TreeMap<>();
        personMap.put (1257, new Person("Joe", "Doe", 35, 150000));
        personMap.put (2598, new Person("Jane", "Allen", 32, 132000));
        personMap.put (1367, new Person("Jessica", "Parker", 43, 220000));
        personMap.put (2109, new Person("John", "Smith", 28, 95000));



        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            entry.getValue().printInfo();
        }


    }
}
