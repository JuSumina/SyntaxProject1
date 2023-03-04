package tests10;



import java.util.LinkedHashSet;
import java.util.Set;

public class Test187 {

    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();
        names.add(null);
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");

        for (String name: names) {
            System.out.println(name);
        }

        var iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
