package tests10;

import java.util.HashSet;
import java.util.Set;

public class Test180 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);

        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}
