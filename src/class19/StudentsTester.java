package class19;

public class StudentsTester {

    public static void main(String[] args) {

        Students student1=new Students();
        student1.name="Julia";
        student1.ID=123;
        student1.numberOfStudents++;

        Students student2=new Students();
        student2.name="Juli";
        student2.ID=456;
        student2.numberOfStudents++;

        Students student3=new Students();
        student3.name="Jules";
        student3.ID=789;
        student3.numberOfStudents++;

        System.out.println(Students.numberOfStudents);


    }
}
