package homework20;


public class StudentTest {

    public static void main(String[] args) {

        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student student: students) {
            student.study();
            student.attendClass();
        }
    }
}
