package class38;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

    public static void main(String[] args) {

        Set<String> qaJobs= new HashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println(qaJobs);

        qaJobs.add("API Tester");
        System.out.println(qaJobs);

        Set <String> linkedSet = new LinkedHashSet<>(qaJobs);
        System.out.println("LinkedHashset: "+linkedSet);

        Set<String> treeSet=new TreeSet<>();
        treeSet.addAll(qaJobs);
        System.out.println("TreeSet: "+treeSet);



    }
}
