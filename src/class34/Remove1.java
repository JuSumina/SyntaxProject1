package class34;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove1 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Lava");
        words.add("Computer");

        var name="Julia";
        var c ='s';

        /*Iterator<String> iterator= words.iterator();

        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")) {
                iterator.remove();
            }

        }
        System.out.println(words);*/

        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);



    }
}
