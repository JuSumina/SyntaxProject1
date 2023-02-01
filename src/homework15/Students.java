package homework15;

public class Students {

    String name;
    int mathGrade;
    int englishGrade;
    int historyGrade;

    Students (String studentName, int mathGr, int englishGr, int historyGr) {
        name=studentName;
        mathGrade=mathGr;
        englishGrade=englishGr;
        historyGrade=historyGr;

    }

    void averageGrade () {

        int averageGr=(mathGrade+englishGrade+historyGrade)/3;
        System.out.println(name+"'s average grade is "+averageGr);
    }


}
