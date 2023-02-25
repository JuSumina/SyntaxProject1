package homework23;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("winter");
        words.add("spring");
        words.add("summer");
        words.add("autumn");

        words.removeIf(s -> s.contains("e"));
        System.out.println(words);
    }
}
