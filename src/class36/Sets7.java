package class36;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Sets7 {

    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");


        LinkedHashSet<String> uniqueList = new LinkedHashSet<>(aList);
        System.out.println(uniqueList);
        
    }
}
