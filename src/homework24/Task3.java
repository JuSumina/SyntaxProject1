package homework24;

import java.util.HashMap;

public class Task3 {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put ("Julia", 193);
        students.put ("Jane", 275);
        students.put ("John", 348);
        students.put ("James", 945);
        students.put ("Jessica", 475);

        System.out.println(students.keySet());
    }
}
