package class20;

public class Student {

    int ID;
    String name;
    int age;
    double weight;

    public Student(int studentID, String studentName, int studentAge) {
        ID = studentID;
        name = studentName;
        age = studentAge;
    }

    public Student(int studentID, String studentName, int studentAge, double studentWeight) {
        ID=studentID;
        name=studentName;
        age=studentAge;
        weight=studentWeight;

    }

    void studentInfo() {

        System.out.println("ID: " + ID + "; Name: " + name + "; Age: " + age + "; Weight: " + weight);
    }

    public static void main(String[] args) {

        Student student1=new Student(123, "Julia", 32, 50.5);
        student1.studentInfo();

        Student student2=new Student(456, "Yuliya", 33);
        student1.studentInfo();

    }
}
