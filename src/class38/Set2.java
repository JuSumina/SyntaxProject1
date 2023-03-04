package class38;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {

    public static void main(String[] args) {

        Set<String> qaJobs= new LinkedHashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");

        for (String qaJob:qaJobs) {
            System.out.print(qaJob+" ");

        }

        System.out.println();

        Iterator<String> iterator = qaJobs.iterator();
        while(iterator.hasNext()) {
            String element= iterator.next();
            System.out.print(element+" ");
        }

    }
}
