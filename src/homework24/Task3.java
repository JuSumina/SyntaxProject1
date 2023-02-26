package homework24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add (new Student ("Julia", 193));
        students.add (new Student ("Jane", 275));
        students.add (new Student ("John", 348));
        students.add (new Student ("James", 945));
        students.add (new Student ("Jessica", 475));

        for (Student student:students) {
            System.out.println(student.getName());
        }
    }
}

class Student {
    String name;
    int studentID;

    Student (String name, int studentID) {
        this.name=name;
        this.studentID=studentID;

    }

    String getName () {
        return name;
    }

    int getID() {
        return studentID;

    }
}
