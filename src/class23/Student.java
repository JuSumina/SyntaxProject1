package class23;

public class Student {

    String name;
    String address;

    Student (String name, String address) {
        this.name=name;
        this.address=address;
    }

    void displayInfo () {
        System.out.println("My name is "+name+". My address is "+address);
    }

    public static void main(String[] args) {

        Student student1=new Student("Julia", "505 Park Avenue, New York");

        student1.displayInfo();
    }
}
