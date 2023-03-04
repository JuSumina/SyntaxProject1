package homework25;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Task4 {

    public static void main(String[] args) {

        LinkedHashSet<String> fruits=new LinkedHashSet<>();
        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Raspberry");

        StringBuilder stringBuilder = new StringBuilder();
        for (String fruit : fruits) {
            stringBuilder.append(fruit);
        }

        String allFruit = stringBuilder.toString();
        System.out.println(allFruit);
    }
}
