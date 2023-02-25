package tests10;

import java.util.LinkedList;

public class Test173 {

    public static void main(String[] args) {

        LinkedList <Integer> numbers = new LinkedList<>();

        for (int i=50; i<100; i++) {
            numbers.add(i);
        }

        numbers.removeIf(n -> (n%3 != 0));
        System.out.println(numbers);

    }
}
