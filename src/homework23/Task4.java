package homework23;

import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("tea");
        words.add("latte");
        words.add("wine");
        words.add("coffee");
        words.add("hot chocolate");
        words.add("whisky");


        words.removeIf(s -> s.contains("a") || s.contains("e"));
        System.out.println(words);


    }
}
