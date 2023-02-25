package homework23;

import java.util.ArrayList;

public class Task5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i=0; i<500; i++) {
            if (i%2==0) {
                numbers.add(i);
            }
        }


        numbers.removeIf(n -> (n / 5 == 0));
        System.out.println(numbers);
    }
}
