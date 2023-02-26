package class37;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {

    public static void main(String[] args) {

        Set<Entry> entrySet=new LinkedHashSet<>() ;

        entrySet.add (new Entry(1, "Julia"));
        entrySet.add (new Entry(2, "Jane"));
        entrySet.add (new Entry(3, "John"));
        entrySet.add (new Entry(4, "Joe"));
        entrySet.add (new Entry(5, "Jessica"));

        Entry entry = new Entry (1,"Julia");
        System.out.println(entry.getKey()+" "+entry.getValue());

        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(entrySet);

    }
}
