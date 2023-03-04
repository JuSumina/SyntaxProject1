package homework25;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(12);
        numbers.add(6);
        numbers.add(13);

        int sum=0;

        for (int i=0; i< numbers.size(); i++) {
            sum=sum+ numbers.get(i);
        }

        System.out.println(sum);

    }
}
