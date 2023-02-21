package class34;

import java.util.LinkedList;

public class LInkedLists2 {

    public static void main(String[] args) {

        LinkedList <String> subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");


        LinkedList <String> futureSubjects=new LinkedList<>();
        subjects.add("Selenium");
        subjects.add("Testng");
        subjects.add("Cucumber");
        subjects.add("SQL");
        subjects.add("API");
        subjects.add("Jenkins");


        LinkedList <String> allSubjects=new LinkedList<>();
        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);

        LinkedList <String> subjectsILike=new LinkedList<>();
        subjectsILike.add("Java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");

        allSubjects.removeAll(subjectsILike);
        System.out.println(allSubjects);






    }
}
