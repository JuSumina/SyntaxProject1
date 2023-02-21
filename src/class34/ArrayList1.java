package class34;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        for (String s:words) {
            if (s.endsWith("a")) {
                words.remove(s);
            }
        }
        System.out.println(words);

    }
}
